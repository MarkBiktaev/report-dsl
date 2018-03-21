/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Length Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLengthUnit()
 * @model
 * @generated
 */
public enum LengthUnit implements Enumerator
{
  /**
   * The '<em><b>Cm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CM_VALUE
   * @generated
   * @ordered
   */
  CM(0, "cm", "cm"),

  /**
   * The '<em><b>Ems</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EMS_VALUE
   * @generated
   * @ordered
   */
  EMS(1, "ems", "ems"),

  /**
   * The '<em><b>Exs</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EXS_VALUE
   * @generated
   * @ordered
   */
  EXS(2, "exs", "exs"),

  /**
   * The '<em><b>In</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #IN_VALUE
   * @generated
   * @ordered
   */
  IN(3, "in", "in"),

  /**
   * The '<em><b>Mm</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MM_VALUE
   * @generated
   * @ordered
   */
  MM(4, "mm", "mm"),

  /**
   * The '<em><b>Pc</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PC_VALUE
   * @generated
   * @ordered
   */
  PC(5, "pc", "pc"),

  /**
   * The '<em><b>Pt</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PT_VALUE
   * @generated
   * @ordered
   */
  PT(6, "pt", "pt"),

  /**
   * The '<em><b>Px</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PX_VALUE
   * @generated
   * @ordered
   */
  PX(7, "px", "px");

  /**
   * The '<em><b>Cm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Cm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CM
   * @model name="cm"
   * @generated
   * @ordered
   */
  public static final int CM_VALUE = 0;

  /**
   * The '<em><b>Ems</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Ems</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EMS
   * @model name="ems"
   * @generated
   * @ordered
   */
  public static final int EMS_VALUE = 1;

  /**
   * The '<em><b>Exs</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exs</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EXS
   * @model name="exs"
   * @generated
   * @ordered
   */
  public static final int EXS_VALUE = 2;

  /**
   * The '<em><b>In</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>In</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #IN
   * @model name="in"
   * @generated
   * @ordered
   */
  public static final int IN_VALUE = 3;

  /**
   * The '<em><b>Mm</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Mm</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MM
   * @model name="mm"
   * @generated
   * @ordered
   */
  public static final int MM_VALUE = 4;

  /**
   * The '<em><b>Pc</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pc</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PC
   * @model name="pc"
   * @generated
   * @ordered
   */
  public static final int PC_VALUE = 5;

  /**
   * The '<em><b>Pt</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Pt</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PT
   * @model name="pt"
   * @generated
   * @ordered
   */
  public static final int PT_VALUE = 6;

  /**
   * The '<em><b>Px</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Px</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PX
   * @model name="px"
   * @generated
   * @ordered
   */
  public static final int PX_VALUE = 7;

  /**
   * An array of all the '<em><b>Length Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LengthUnit[] VALUES_ARRAY =
    new LengthUnit[]
    {
      CM,
      EMS,
      EXS,
      IN,
      MM,
      PC,
      PT,
      PX,
    };

  /**
   * A public read-only list of all the '<em><b>Length Unit</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LengthUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Length Unit</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LengthUnit get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LengthUnit result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Length Unit</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LengthUnit getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LengthUnit result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Length Unit</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LengthUnit get(int value)
  {
    switch (value)
    {
      case CM_VALUE: return CM;
      case EMS_VALUE: return EMS;
      case EXS_VALUE: return EXS;
      case IN_VALUE: return IN;
      case MM_VALUE: return MM;
      case PC_VALUE: return PC;
      case PT_VALUE: return PT;
      case PX_VALUE: return PX;
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
  private LengthUnit(int value, String name, String literal)
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
  
} //LengthUnit
