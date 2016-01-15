package reponse;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.Alternatives;
import org.xtext.example.mydsl.myDsl.Mandatory;
import org.xtext.example.mydsl.myDsl.Optional;
import org.xtext.example.mydsl.myDsl.Video;
import org.xtext.example.mydsl.myDsl.VideoGen;

public class Question1 {
	
		private VideoGen textToModel(String file){			
			Resource res = new ResourceSetImpl().getResource(URI.createFileURI(file), true);
			return (VideoGen) res.getContents().get(0);	
		}
		
		
		public static void main(String [] args) {
			Question1  transform = new Question1 ();
			transform.GenerateFFmpegFile("ffmpeg_generated.txt");
		}
		
		public void GenerateFFmpegFile(String fileName) {
			VideoGen root = textToModel("exampl.idmtp2");
			Random r = new Random();
			
			try (FileWriter writer = new FileWriter(fileName);
					PrintWriter printWriter = new PrintWriter(writer)) {
				EList<Video> videos = root.getVideo();
				
				for(int i = 0; i < videos.size(); i++)
				{
					// Add mandatory sequences
					if(videos.get(i) instanceof Mandatory)
						printWriter.println("file '" + ((Mandatory)videos.get(i)).getVideoSeq().getName() + "'");
					else if(videos.get(i) instanceof Optional) { // Add optional sequences
						if(r.nextInt(2) == 1)
							printWriter.println("file '" + ((Optional)videos.get(i)).getVideoSeq().getName() + "'");
					}
					
					// Add alternative sequences
					if(videos.get(i) instanceof Alternatives) {
						Alternatives alt = (Alternatives)videos.get(i);
						
						int pickedAlternative = r.nextInt(alt.getAlternatives().size());
						printWriter.println("file '" + alt.getAlternatives().get(pickedAlternative).getName() + "'");
					}
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

