package demasy.oracle.apps.xxed.core.lov.server;

import oracle.apps.fnd.framework.server.OAApplicationModuleImpl;
import oracle.apps.fnd.framework.server.OAViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CoreLovAMImpl extends OAApplicationModuleImpl
{
  /**This is the default constructor (do not remove)
   */
  public CoreLovAMImpl()
  {
  }

  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args)
  {
    launchTester("demasy.oracle.apps.xxed.core.lov.server", /* package name */
      "CoreLovAMLocal" /* Configuration Name */);
  }

  /**Container's getter for ApplicationsLovVO1
   */
  public OAViewObjectImpl getApplicationsLovVO1()
  {
    return (OAViewObjectImpl)findViewObject("ApplicationsLovVO1");
  }
}
