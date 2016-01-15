/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Optional;
import org.xtext.example.mydsl.myDsl.VideoSeq;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.OptionalImpl#getVideoSeq <em>Video Seq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalImpl extends VideoImpl implements Optional
{
  /**
   * The cached value of the '{@link #getVideoSeq() <em>Video Seq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVideoSeq()
   * @generated
   * @ordered
   */
  protected VideoSeq videoSeq;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.OPTIONAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoSeq getVideoSeq()
  {
    return videoSeq;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVideoSeq(VideoSeq newVideoSeq, NotificationChain msgs)
  {
    VideoSeq oldVideoSeq = videoSeq;
    videoSeq = newVideoSeq;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.OPTIONAL__VIDEO_SEQ, oldVideoSeq, newVideoSeq);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVideoSeq(VideoSeq newVideoSeq)
  {
    if (newVideoSeq != videoSeq)
    {
      NotificationChain msgs = null;
      if (videoSeq != null)
        msgs = ((InternalEObject)videoSeq).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OPTIONAL__VIDEO_SEQ, null, msgs);
      if (newVideoSeq != null)
        msgs = ((InternalEObject)newVideoSeq).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.OPTIONAL__VIDEO_SEQ, null, msgs);
      msgs = basicSetVideoSeq(newVideoSeq, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.OPTIONAL__VIDEO_SEQ, newVideoSeq, newVideoSeq));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.OPTIONAL__VIDEO_SEQ:
        return basicSetVideoSeq(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.OPTIONAL__VIDEO_SEQ:
        return getVideoSeq();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.OPTIONAL__VIDEO_SEQ:
        setVideoSeq((VideoSeq)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.OPTIONAL__VIDEO_SEQ:
        setVideoSeq((VideoSeq)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.OPTIONAL__VIDEO_SEQ:
        return videoSeq != null;
    }
    return super.eIsSet(featureID);
  }

} //OptionalImpl
