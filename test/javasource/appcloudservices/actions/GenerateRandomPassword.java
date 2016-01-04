// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package appcloudservices.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Generate a valid strong random password for Mendix user
 */
public class GenerateRandomPassword extends CustomJavaAction<String>
{
	private Long length;

	public GenerateRandomPassword(IContext context, Long length)
	{
		super(context);
		this.length = length;
	}

	@Override
	public String executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "GenerateRandomPassword";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}