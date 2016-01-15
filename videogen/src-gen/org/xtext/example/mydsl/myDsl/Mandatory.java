/**
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Mandatory#getVideoSeq <em>Video Seq</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends Video
{
  /**
   * Returns the value of the '<em><b>Video Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Video Seq</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Video Seq</em>' containment reference.
   * @see #setVideoSeq(VideoSeq)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getMandatory_VideoSeq()
   * @model containment="true"
   * @generated
   */
  VideoSeq getVideoSeq();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Mandatory#getVideoSeq <em>Video Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Video Seq</em>' containment reference.
   * @see #getVideoSeq()
   * @generated
   */
  void setVideoSeq(VideoSeq value);

} // Mandatory
