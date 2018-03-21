/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Drill Through Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getDrillThroughType()
 * @model
 * @generated
 */
public enum DrillThroughType implements Enumerator
{
  /**
   * The '<em><b>New Window</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEW_WINDOW_VALUE
   * @generated
   * @ordered
   */
  NEW_WINDOW(0, "NewWindow", "new-window"),

  /**
   * The '<em><b>Same Frame</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAME_FRAME_VALUE
   * @generated
   * @ordered
   */
  SAME_FRAME(1, "SameFrame", "same-frame"),

  /**
   * The '<em><b>Parent Frame</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PARENT_FRAME_VALUE
   * @generated
   * @ordered
   */
  PARENT_FRAME(2, "ParentFrame", "parent-frame"),

  /**
   * The '<em><b>Whole Page</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WHOLE_PAGE_VALUE
   * @generated
   * @ordered
   */
  WHOLE_PAGE(3, "WholePage", "whole-page");

  /**
   * The '<em><b>New Window</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>New Window</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEW_WINDOW
   * @model name="NewWindow" literal="new-window"
   * @generated
   * @ordered
   */
  public static final int NEW_WINDOW_VALUE = 0;

  /**
   * The '<em><b>Same Frame</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Same Frame</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAME_FRAME
   * @model name="SameFrame" literal="same-frame"
   * @generated
   * @ordered
   */
  public static final int SAME_FRAME_VALUE = 1;

  /**
   * The '<em><b>Parent Frame</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Parent Frame</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PARENT_FRAME
   * @model name="ParentFrame" literal="parent-frame"
   * @generated
   * @ordered
   */
  public static final int PARENT_FRAME_VALUE = 2;

  /**
   * The '<em><b>Whole Page</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Whole Page</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WHOLE_PAGE
   * @model name="WholePage" literal="whole-page"
   * @generated
   * @ordered
   */
  public static final int WHOLE_PAGE_VALUE = 3;

  /**
   * An array of all the '<em><b>Drill Through Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DrillThroughType[] VALUES_ARRAY =
    new DrillThroughType[]
    {
      NEW_WINDOW,
      SAME_FRAME,
      PARENT_FRAME,
      WHOLE_PAGE,
    };

  /**
   * A public read-only list of all the '<em><b>Drill Through Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DrillThroughType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Drill Through Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DrillThroughType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DrillThroughType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Drill Through Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DrillThroughType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DrillThroughType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Drill Through Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DrillThroughType get(int value)
  {
    switch (value)
    {
      case NEW_WINDOW_VALUE: return NEW_WINDOW;
      case SAME_FRAME_VALUE: return SAME_FRAME;
      case PARENT_FRAME_VALUE: return PARENT_FRAME;
      case WHOLE_PAGE_VALUE: return WHOLE_PAGE;
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
  private DrillThroughType(int value, String name, String literal)
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
  
} //DrillThroughType
