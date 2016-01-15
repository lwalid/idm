/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoGenImpl <em>Video Gen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VideoGenImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideoGen()
   * @generated
   */
  int VIDEO_GEN = 0;

  /**
   * The feature id for the '<em><b>Video</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN__VIDEO = 0;

  /**
   * The number of structural features of the '<em>Video Gen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoImpl <em>Video</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VideoImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideo()
   * @generated
   */
  int VIDEO = 1;

  /**
   * The number of structural features of the '<em>Video</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.MandatoryImpl <em>Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.MandatoryImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMandatory()
   * @generated
   */
  int MANDATORY = 2;

  /**
   * The feature id for the '<em><b>Video Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY__VIDEO_SEQ = VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.OptionalImpl <em>Optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.OptionalImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 3;

  /**
   * The feature id for the '<em><b>Video Seq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL__VIDEO_SEQ = VIDEO_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.AlternativeImpl <em>Alternative</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.AlternativeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAlternative()
   * @generated
   */
  int ALTERNATIVE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__NAME = VIDEO_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Video Seq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE__VIDEO_SEQ = VIDEO_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Alternative</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVE_FEATURE_COUNT = VIDEO_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoSeqImpl <em>Video Seq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.VideoSeqImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideoSeq()
   * @generated
   */
  int VIDEO_SEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__ID = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ__NAME = 1;

  /**
   * The number of structural features of the '<em>Video Seq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_SEQ_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen</em>'.
   * @see org.xtext.example.mydsl.myDsl.VideoGen
   * @generated
   */
  EClass getVideoGen();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.VideoGen#getVideo <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Video</em>'.
   * @see org.xtext.example.mydsl.myDsl.VideoGen#getVideo()
   * @see #getVideoGen()
   * @generated
   */
  EReference getVideoGen_Video();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Video <em>Video</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video</em>'.
   * @see org.xtext.example.mydsl.myDsl.Video
   * @generated
   */
  EClass getVideo();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mandatory
   * @generated
   */
  EClass getMandatory();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Mandatory#getVideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Video Seq</em>'.
   * @see org.xtext.example.mydsl.myDsl.Mandatory#getVideoSeq()
   * @see #getMandatory()
   * @generated
   */
  EReference getMandatory_VideoSeq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional</em>'.
   * @see org.xtext.example.mydsl.myDsl.Optional
   * @generated
   */
  EClass getOptional();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Optional#getVideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Video Seq</em>'.
   * @see org.xtext.example.mydsl.myDsl.Optional#getVideoSeq()
   * @see #getOptional()
   * @generated
   */
  EReference getOptional_VideoSeq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Alternative <em>Alternative</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alternative</em>'.
   * @see org.xtext.example.mydsl.myDsl.Alternative
   * @generated
   */
  EClass getAlternative();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Alternative#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Alternative#getName()
   * @see #getAlternative()
   * @generated
   */
  EAttribute getAlternative_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Alternative#getVideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Video Seq</em>'.
   * @see org.xtext.example.mydsl.myDsl.Alternative#getVideoSeq()
   * @see #getAlternative()
   * @generated
   */
  EReference getAlternative_VideoSeq();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.VideoSeq <em>Video Seq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Seq</em>'.
   * @see org.xtext.example.mydsl.myDsl.VideoSeq
   * @generated
   */
  EClass getVideoSeq();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VideoSeq#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.xtext.example.mydsl.myDsl.VideoSeq#getId()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Id();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.VideoSeq#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.VideoSeq#getName()
   * @see #getVideoSeq()
   * @generated
   */
  EAttribute getVideoSeq_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoGenImpl <em>Video Gen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VideoGenImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideoGen()
     * @generated
     */
    EClass VIDEO_GEN = eINSTANCE.getVideoGen();

    /**
     * The meta object literal for the '<em><b>Video</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN__VIDEO = eINSTANCE.getVideoGen_Video();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoImpl <em>Video</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VideoImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideo()
     * @generated
     */
    EClass VIDEO = eINSTANCE.getVideo();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.MandatoryImpl <em>Mandatory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.MandatoryImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMandatory()
     * @generated
     */
    EClass MANDATORY = eINSTANCE.getMandatory();

    /**
     * The meta object literal for the '<em><b>Video Seq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MANDATORY__VIDEO_SEQ = eINSTANCE.getMandatory_VideoSeq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.OptionalImpl <em>Optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.OptionalImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getOptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getOptional();

    /**
     * The meta object literal for the '<em><b>Video Seq</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPTIONAL__VIDEO_SEQ = eINSTANCE.getOptional_VideoSeq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.AlternativeImpl <em>Alternative</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.AlternativeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAlternative()
     * @generated
     */
    EClass ALTERNATIVE = eINSTANCE.getAlternative();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVE__NAME = eINSTANCE.getAlternative_Name();

    /**
     * The meta object literal for the '<em><b>Video Seq</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVE__VIDEO_SEQ = eINSTANCE.getAlternative_VideoSeq();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.VideoSeqImpl <em>Video Seq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.VideoSeqImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVideoSeq()
     * @generated
     */
    EClass VIDEO_SEQ = eINSTANCE.getVideoSeq();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__ID = eINSTANCE.getVideoSeq_Id();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEO_SEQ__NAME = eINSTANCE.getVideoSeq_Name();

  }

} //MyDslPackage
