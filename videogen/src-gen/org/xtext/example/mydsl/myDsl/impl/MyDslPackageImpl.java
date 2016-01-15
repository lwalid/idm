/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.Alternative;
import org.xtext.example.mydsl.myDsl.Mandatory;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Optional;
import org.xtext.example.mydsl.myDsl.Video;
import org.xtext.example.mydsl.myDsl.VideoGen;
import org.xtext.example.mydsl.myDsl.VideoSeq;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoGenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoSeqEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoGen()
  {
    return videoGenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVideoGen_Video()
  {
    return (EReference)videoGenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideo()
  {
    return videoEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatory()
  {
    return mandatoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMandatory_VideoSeq()
  {
    return (EReference)mandatoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptional()
  {
    return optionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOptional_VideoSeq()
  {
    return (EReference)optionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlternative()
  {
    return alternativeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlternative_Name()
  {
    return (EAttribute)alternativeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlternative_VideoSeq()
  {
    return (EReference)alternativeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoSeq()
  {
    return videoSeqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Id()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVideoSeq_Name()
  {
    return (EAttribute)videoSeqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    videoGenEClass = createEClass(VIDEO_GEN);
    createEReference(videoGenEClass, VIDEO_GEN__VIDEO);

    videoEClass = createEClass(VIDEO);

    mandatoryEClass = createEClass(MANDATORY);
    createEReference(mandatoryEClass, MANDATORY__VIDEO_SEQ);

    optionalEClass = createEClass(OPTIONAL);
    createEReference(optionalEClass, OPTIONAL__VIDEO_SEQ);

    alternativeEClass = createEClass(ALTERNATIVE);
    createEAttribute(alternativeEClass, ALTERNATIVE__NAME);
    createEReference(alternativeEClass, ALTERNATIVE__VIDEO_SEQ);

    videoSeqEClass = createEClass(VIDEO_SEQ);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__ID);
    createEAttribute(videoSeqEClass, VIDEO_SEQ__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mandatoryEClass.getESuperTypes().add(this.getVideo());
    optionalEClass.getESuperTypes().add(this.getVideo());
    alternativeEClass.getESuperTypes().add(this.getVideo());

    // Initialize classes and features; add operations and parameters
    initEClass(videoGenEClass, VideoGen.class, "VideoGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVideoGen_Video(), this.getVideo(), null, "video", null, 0, -1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoEClass, Video.class, "Video", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMandatory_VideoSeq(), this.getVideoSeq(), null, "videoSeq", null, 0, 1, Mandatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOptional_VideoSeq(), this.getVideoSeq(), null, "videoSeq", null, 0, 1, Optional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlternative_Name(), ecorePackage.getEString(), "name", null, 0, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlternative_VideoSeq(), this.getVideoSeq(), null, "videoSeq", null, 0, -1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoSeqEClass, VideoSeq.class, "VideoSeq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVideoSeq_Id(), ecorePackage.getEString(), "id", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVideoSeq_Name(), ecorePackage.getEString(), "name", null, 0, 1, VideoSeq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
