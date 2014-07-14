package org.pentaho.di.ui.trans.steps.mystep;

import org.eclipse.swt.widgets.Shell;
import org.pentaho.di.trans.TransMeta;
import org.pentaho.di.trans.step.BaseStepMeta;
import org.pentaho.di.trans.step.StepDialogInterface;
import org.pentaho.di.ui.spoon.Spoon;
import org.pentaho.di.ui.spoon.dialog.HttpLiteDialog;
import org.pentaho.di.ui.trans.step.BaseStepDialog;

/**
 * @author Rowell Belen
 */
public class MyStepDialog extends BaseStepDialog implements StepDialogInterface {

  public MyStepDialog( Shell parent, Object in, TransMeta transMeta, String sname ) {
    super( parent, (BaseStepMeta) in, transMeta, sname );
  }

  @Override
  public String open() {
    final String url = "http://localhost:3388/static/index.html";
    HttpLiteDialog httpLiteDialog = new HttpLiteDialog( Spoon.getInstance().getShell(), "HttpLite", url, "AngularJS Test" );
    httpLiteDialog.open();

    return this.stepname;
  }
}