/**
 */
package it.unitn.disi.zanshin.model.eca;

import it.unitn.disi.zanshin.model.gore.AggregationLevel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Change Parameter Strategy</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getLevel <em>Level</em>}</li>
 * <li>{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getChangeParameterStrategy()
 * @model
 * @generated
 */
public interface ChangeParameterStrategy extends AdaptationStrategy {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute. The default value is <code>"class-level"</code>. The
	 * literals are from the enumeration {@link it.unitn.disi.zanshin.model.gore.AggregationLevel}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #setLevel(AggregationLevel)
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getChangeParameterStrategy_Level()
	 * @model default="class-level"
	 * @generated
	 */
	AggregationLevel getLevel();

	/**
	 * Sets the value of the '{@link it.unitn.disi.zanshin.model.eca.ChangeParameterStrategy#getLevel <em>Level</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Level</em>' attribute.
	 * @see it.unitn.disi.zanshin.model.gore.AggregationLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(AggregationLevel value);

	/**
	 * Returns the value of the '<em><b>Changes</b></em>' reference list. The list contents are of type
	 * {@link it.unitn.disi.zanshin.model.eca.ParameterChange}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Changes</em>' reference list.
	 * @see it.unitn.disi.zanshin.model.eca.EcaPackage#getChangeParameterStrategy_Changes()
	 * @model
	 * @generated
	 */
	EList<ParameterChange> getChanges();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @model annotation=
	 *        "http://www.eclipse.org/emf/2002/GenModel body='String strategyName = eClass().getName();\n\n// Obtains a reference to the target system\'s controller and checks if it exists (if it has been registered).\nit.unitn.disi.zanshin.services.ITargetSystemControllerService controller = it.unitn.disi.zanshin.core.Activator.getControllerService();\nif (controller == null) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Attempting to apply {0}, but the target system\'s controller has not yet been registered!\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Retrieve the strategy\'s attributes.\nit.unitn.disi.zanshin.model.eca.EcaAwReq awreq = getAwReq();\n\n// At least one change should be given.\nif ((changes == null) || (changes.isEmpty())) {\n\tit.unitn.disi.zanshin.core.CoreUtils.log.warn(\"Strategy {0} is missing mandatory attribute \\\"changes\\\" and cannot be executed.\", strategyName); //$NON-NLS-1$\n\treturn;\n}\n\n// Attribute level defaults to CLASS.\nif (level == null)\n\tlevel = it.unitn.disi.zanshin.model.gore.AggregationLevel.CLASS;\n\n// Generates the name of the strategy with the changes that should be done.\nStringBuilder builder = new StringBuilder(strategyName).append(\'(\');\nfor (it.unitn.disi.zanshin.model.eca.ParameterChange change : changes)\n\tbuilder.append(change.getParam().eClass().getName()).append(\" -> \").append(change.getValue()).append(\", \"); //$NON-NLS-1$ //$NON-NLS-2$\nbuilder.deleteCharAt(builder.length() - 1).append(\')\');\nstrategyName = builder.toString();\n\n// Executes the ChangeParameter strategy.\nit.unitn.disi.zanshin.core.CoreUtils.log.info(\"{0} Applying strategy {1}...\", session.getId(), strategyName); //$NON-NLS-1$'"
	 * @generated
	 */
	void execute(AdaptationSession session);

} // ChangeParameterStrategy
