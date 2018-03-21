/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Output Format Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getOutputFormatType()
 * @model
 * @generated
 */
public enum OutputFormatType implements Enumerator
{
  /**
   * The '<em><b>Xlsx</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XLSX_VALUE
   * @generated
   * @ordered
   */
  XLSX(0, "xlsx", "xlsx"),

  /**
   * The '<em><b>Postscript</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POSTSCRIPT_VALUE
   * @generated
   * @ordered
   */
  POSTSCRIPT(1, "postscript", "postscript"),

  /**
   * The '<em><b>Docx</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOCX_VALUE
   * @generated
   * @ordered
   */
  DOCX(2, "docx", "docx"),

  /**
   * The '<em><b>Pptx</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PPTX_VALUE
   * @generated
   * @ordered
   */
  PPTX(3, "pptx", "pptx"),

  /**
   * The '<em><b>Pdf</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PDF_VALUE
   * @generated
   * @ordered
   */
  PDF(4, "pdf", "pdf"),

  /**
   * The '<em><b>Xls</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #XLS_VALUE
   * @generated
   * @ordered
   */
  XLS(5, "xls", "xls"),

  /**
   * The '<em><b>Ppt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PPT_VALUE
   * @generated
   * @ordered
   */
  PPT(6, "ppt", "ppt"),

  /**
   * The '<em><b>Doc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DOC_VALUE
   * @generated
   * @ordered
   */
  DOC(7, "doc", "doc"),

  /**
   * The '<em><b>Html</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HTML_VALUE
   * @generated
   * @ordered
   */
  HTML(8, "html", "html"),

  /**
   * The '<em><b>Odp</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ODP_VALUE
   * @generated
   * @ordered
   */
  ODP(9, "odp", "odp"),

  /**
   * The '<em><b>Odt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ODT_VALUE
   * @generated
   * @ordered
   */
  ODT(10, "odt", "odt"),

  /**
   * The '<em><b>Ods</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ODS_VALUE
   * @generated
   * @ordered
   */
  ODS(11, "ods", "ods");

  /**
   * The '<em><b>Xlsx</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Xlsx</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XLSX
   * @model name="xlsx"
   * @generated
   * @ordered
   */
  public static final int XLSX_VALUE = 0;

  /**
   * The '<em><b>Postscript</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Postscript</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POSTSCRIPT
   * @model name="postscript"
   * @generated
   * @ordered
   */
  public static final int POSTSCRIPT_VALUE = 1;

  /**
   * The '<em><b>Docx</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Docx</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOCX
   * @model name="docx"
   * @generated
   * @ordered
   */
  public static final int DOCX_VALUE = 2;

  /**
   * The '<em><b>Pptx</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pptx</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PPTX
   * @model name="pptx"
   * @generated
   * @ordered
   */
  public static final int PPTX_VALUE = 3;

  /**
   * The '<em><b>Pdf</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pdf</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PDF
   * @model name="pdf"
   * @generated
   * @ordered
   */
  public static final int PDF_VALUE = 4;

  /**
   * The '<em><b>Xls</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Xls</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #XLS
   * @model name="xls"
   * @generated
   * @ordered
   */
  public static final int XLS_VALUE = 5;

  /**
   * The '<em><b>Ppt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ppt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PPT
   * @model name="ppt"
   * @generated
   * @ordered
   */
  public static final int PPT_VALUE = 6;

  /**
   * The '<em><b>Doc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Doc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DOC
   * @model name="doc"
   * @generated
   * @ordered
   */
  public static final int DOC_VALUE = 7;

  /**
   * The '<em><b>Html</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Html</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HTML
   * @model name="html"
   * @generated
   * @ordered
   */
  public static final int HTML_VALUE = 8;

  /**
   * The '<em><b>Odp</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Odp</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ODP
   * @model name="odp"
   * @generated
   * @ordered
   */
  public static final int ODP_VALUE = 9;

  /**
   * The '<em><b>Odt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Odt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ODT
   * @model name="odt"
   * @generated
   * @ordered
   */
  public static final int ODT_VALUE = 10;

  /**
   * The '<em><b>Ods</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ods</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ODS
   * @model name="ods"
   * @generated
   * @ordered
   */
  public static final int ODS_VALUE = 11;

  /**
   * An array of all the '<em><b>Output Format Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final OutputFormatType[] VALUES_ARRAY =
    new OutputFormatType[]
    {
      XLSX,
      POSTSCRIPT,
      DOCX,
      PPTX,
      PDF,
      XLS,
      PPT,
      DOC,
      HTML,
      ODP,
      ODT,
      ODS,
    };

  /**
   * A public read-only list of all the '<em><b>Output Format Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<OutputFormatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Output Format Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OutputFormatType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputFormatType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Format Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OutputFormatType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      OutputFormatType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Output Format Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OutputFormatType get(int value)
  {
    switch (value)
    {
      case XLSX_VALUE: return XLSX;
      case POSTSCRIPT_VALUE: return POSTSCRIPT;
      case DOCX_VALUE: return DOCX;
      case PPTX_VALUE: return PPTX;
      case PDF_VALUE: return PDF;
      case XLS_VALUE: return XLS;
      case PPT_VALUE: return PPT;
      case DOC_VALUE: return DOC;
      case HTML_VALUE: return HTML;
      case ODP_VALUE: return ODP;
      case ODT_VALUE: return ODT;
      case ODS_VALUE: return ODS;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private OutputFormatType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //OutputFormatType
