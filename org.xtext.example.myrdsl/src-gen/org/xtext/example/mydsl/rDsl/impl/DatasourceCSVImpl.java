/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.BooleanLiteral;
import org.xtext.example.mydsl.rDsl.DatasourceCSV;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datasource CSV</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl#getDelimiter <em>Delimiter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DatasourceCSVImpl#getHeaderline <em>Headerline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatasourceCSVImpl extends MinimalEObjectImpl.Container implements DatasourceCSV
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharset()
   * @generated
   * @ordered
   */
  protected static final String CHARSET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharset()
   * @generated
   * @ordered
   */
  protected String charset = CHARSET_EDEFAULT;

  /**
   * The default value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected static final String DELIMITER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDelimiter()
   * @generated
   * @ordered
   */
  protected String delimiter = DELIMITER_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaderline() <em>Headerline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderline()
   * @generated
   * @ordered
   */
  protected BooleanLiteral headerline;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DatasourceCSVImpl()
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
    return RDslPackage.eINSTANCE.getDatasourceCSV();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DATASOURCE_CSV__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCharset()
  {
    return charset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCharset(String newCharset)
  {
    String oldCharset = charset;
    charset = newCharset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DATASOURCE_CSV__CHARSET, oldCharset, charset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDelimiter()
  {
    return delimiter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDelimiter(String newDelimiter)
  {
    String oldDelimiter = delimiter;
    delimiter = newDelimiter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DATASOURCE_CSV__DELIMITER, oldDelimiter, delimiter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getHeaderline()
  {
    return headerline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaderline(BooleanLiteral newHeaderline, NotificationChain msgs)
  {
    BooleanLiteral oldHeaderline = headerline;
    headerline = newHeaderline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.DATASOURCE_CSV__HEADERLINE, oldHeaderline, newHeaderline);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeaderline(BooleanLiteral newHeaderline)
  {
    if (newHeaderline != headerline)
    {
      NotificationChain msgs = null;
      if (headerline != null)
        msgs = ((InternalEObject)headerline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DATASOURCE_CSV__HEADERLINE, null, msgs);
      if (newHeaderline != null)
        msgs = ((InternalEObject)newHeaderline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DATASOURCE_CSV__HEADERLINE, null, msgs);
      msgs = basicSetHeaderline(newHeaderline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DATASOURCE_CSV__HEADERLINE, newHeaderline, newHeaderline));
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
      case RDslPackage.DATASOURCE_CSV__HEADERLINE:
        return basicSetHeaderline(null, msgs);
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
      case RDslPackage.DATASOURCE_CSV__URL:
        return getUrl();
      case RDslPackage.DATASOURCE_CSV__CHARSET:
        return getCharset();
      case RDslPackage.DATASOURCE_CSV__DELIMITER:
        return getDelimiter();
      case RDslPackage.DATASOURCE_CSV__HEADERLINE:
        return getHeaderline();
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
      case RDslPackage.DATASOURCE_CSV__URL:
        setUrl((String)newValue);
        return;
      case RDslPackage.DATASOURCE_CSV__CHARSET:
        setCharset((String)newValue);
        return;
      case RDslPackage.DATASOURCE_CSV__DELIMITER:
        setDelimiter((String)newValue);
        return;
      case RDslPackage.DATASOURCE_CSV__HEADERLINE:
        setHeaderline((BooleanLiteral)newValue);
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
      case RDslPackage.DATASOURCE_CSV__URL:
        setUrl(URL_EDEFAULT);
        return;
      case RDslPackage.DATASOURCE_CSV__CHARSET:
        setCharset(CHARSET_EDEFAULT);
        return;
      case RDslPackage.DATASOURCE_CSV__DELIMITER:
        setDelimiter(DELIMITER_EDEFAULT);
        return;
      case RDslPackage.DATASOURCE_CSV__HEADERLINE:
        setHeaderline((BooleanLiteral)null);
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
      case RDslPackage.DATASOURCE_CSV__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case RDslPackage.DATASOURCE_CSV__CHARSET:
        return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
      case RDslPackage.DATASOURCE_CSV__DELIMITER:
        return DELIMITER_EDEFAULT == null ? delimiter != null : !DELIMITER_EDEFAULT.equals(delimiter);
      case RDslPackage.DATASOURCE_CSV__HEADERLINE:
        return headerline != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (url: ");
    result.append(url);
    result.append(", charset: ");
    result.append(charset);
    result.append(", delimiter: ");
    result.append(delimiter);
    result.append(')');
    return result.toString();
  }

} //DatasourceCSVImpl
