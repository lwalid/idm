/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.VideoGen#getVideo <em>Video</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Video</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Video}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Video</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Video</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getVideoGen_Video()
   * @model containment="true"
   * @generated
   */
  EList<Video> getVideo();

} // VideoGen
