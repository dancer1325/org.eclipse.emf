package org.eclipse.emf.codegen.ecore.templates.editor;

import java.util.List;
import java.util.Iterator;
import org.eclipse.emf.codegen.ecore.genmodel.*;

public class Advisor
{
  protected final String NL = System.getProperties().getProperty("line.separator");
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**" + NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_3 = "Id";
  protected final String TEXT_4 = NL + " */" + NL + "package ";
  protected final String TEXT_5 = ";" + NL + "" + NL + "" + NL + "import java.io.File;" + NL + "import java.util.Iterator;" + NL + "" + NL + "import org.eclipse.core.runtime.IPlatformRunnable;" + NL + "import org.eclipse.jface.action.IAction;" + NL + "import org.eclipse.jface.action.IMenuManager;" + NL + "import org.eclipse.jface.action.GroupMarker;" + NL + "import org.eclipse.jface.action.MenuManager;" + NL + "import org.eclipse.jface.action.Separator;" + NL + "import org.eclipse.jface.dialogs.Dialog;" + NL + "import org.eclipse.jface.dialogs.MessageDialog;" + NL + "import org.eclipse.swt.graphics.Point;" + NL + "import org.eclipse.swt.SWT;" + NL + "import org.eclipse.swt.widgets.Display;" + NL + "import org.eclipse.swt.widgets.FileDialog;" + NL + "import org.eclipse.swt.widgets.Shell;" + NL + "import org.eclipse.ui.actions.ActionFactory;" + NL + "import org.eclipse.ui.actions.ContributionItemFactory;" + NL + "import org.eclipse.ui.application.IActionBarConfigurer;" + NL + "import org.eclipse.ui.application.IWorkbenchConfigurer;" + NL + "import org.eclipse.ui.application.IWorkbenchWindowConfigurer;" + NL + "import org.eclipse.ui.application.WorkbenchAdvisor;" + NL + "import org.eclipse.ui.IEditorDescriptor;" + NL + "import org.eclipse.ui.IFolderLayout;" + NL + "import org.eclipse.ui.IPageLayout;" + NL + "import org.eclipse.ui.IPerspectiveFactory;" + NL + "import org.eclipse.ui.IWorkbench;" + NL + "import org.eclipse.ui.IWorkbenchActionConstants;" + NL + "import org.eclipse.ui.IWorkbenchPage;" + NL + "import org.eclipse.ui.IWorkbenchWindow;" + NL + "import org.eclipse.ui.PartInitException;" + NL + "import org.eclipse.ui.PlatformUI;" + NL + "" + NL + "import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;" + NL + "import org.eclipse.emf.common.ui.URIEditorInput;" + NL + "import org.eclipse.emf.common.util.URI;" + NL + "import org.eclipse.emf.edit.ui.action.LoadResourceAction;" + NL + "" + NL + "import ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + NL + NL + "/**" + NL + " * Customized {@link WorkbenchAdvisor} for the RCP application." + NL + " * <!-- begin-user-doc -->" + NL + " * <!-- end-user-doc -->" + NL + " * @generated" + NL + " */" + NL + "public final class ";
  protected final String TEXT_8 = " extends WorkbenchAdvisor" + NL + "{";
  protected final String TEXT_9 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final String copyright = \"";
  protected final String TEXT_10 = "\";";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL + "\t/**" + NL + "\t * This looks up a string in the plugin's plugin.properties file." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getString(String key)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_13 = ".INSTANCE.getString(key);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * This looks up a string in plugin.properties, making a substitution." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static String getString(String key, Object s1)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_14 = ".INSTANCE.getString(key, new Object [] { s1 });" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * RCP's application" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Application implements IPlatformRunnable" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.core.runtime.IPlatformRunnable#run(java.lang.Object)" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic Object run(Object args)" + NL + "\t\t{" + NL + "\t\t\tWorkbenchAdvisor workbenchAdvisor = new ";
  protected final String TEXT_15 = "();" + NL + "\t\t\tDisplay display = PlatformUI.createDisplay();" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\tint returnCode = PlatformUI.createAndRunWorkbench(display, workbenchAdvisor);" + NL + "\t\t\t\tif (returnCode == PlatformUI.RETURN_RESTART)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn IPlatformRunnable.EXIT_RESTART;" + NL + "\t\t\t\t}" + NL + "\t\t\t\telse" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\treturn IPlatformRunnable.EXIT_OK;" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t\tfinally" + NL + "\t\t\t{" + NL + "\t\t\t\tdisplay.dispose();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * RCP's perspective" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class Perspective implements IPerspectiveFactory" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * Perspective ID" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic static final String ID_PERSPECTIVE = \"";
  protected final String TEXT_16 = "Perspective\";";
  protected final String TEXT_17 = NL + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void createInitialLayout(IPageLayout layout)" + NL + "\t\t{" + NL + "\t\t\tlayout.setEditorAreaVisible(true);" + NL + "\t\t\tlayout.addPerspectiveShortcut(ID_PERSPECTIVE);" + NL + "" + NL + "\t\t\tIFolderLayout right = layout.createFolder(\"right\", IPageLayout.RIGHT, (float)0.66, layout.getEditorArea());";
  protected final String TEXT_18 = NL + "\t\t\tright.addView(IPageLayout.ID_OUTLINE);" + NL + "" + NL + "\t\t\tIFolderLayout bottonRight = layout.createFolder(\"bottonRight\", IPageLayout.BOTTOM, (float)0.60, \"right\");";
  protected final String TEXT_19 = NL + "\t\t\tbottonRight.addView(IPageLayout.ID_PROP_SHEET);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * About action for the RCP application." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class AboutAction extends WorkbenchWindowActionDelegate" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)" + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(IAction action)" + NL + "\t\t{" + NL + "\t\t\tMessageDialog.openInformation(getWindow().getShell(), getString(\"_UI_About_title\"),";
  protected final String TEXT_20 = NL + "\t\t\tgetString(\"_UI_About_text\"));";
  protected final String TEXT_21 = NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Open action for the objects from the ";
  protected final String TEXT_22 = " model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class OpenAction extends WorkbenchWindowActionDelegate" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * Opens the editors for the files selected using the file dialog." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(IAction action)" + NL + "\t\t{" + NL + "\t\t\tString filePath = openFilePathDialog(getWindow().getShell(), null, SWT.OPEN);" + NL + "\t\t\tif (filePath != null)" + NL + "\t\t\t{" + NL + "\t\t\t\topenEditor(getWindow().getWorkbench(), URI.createFileURI(filePath));" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Open URI action for the objects from the ";
  protected final String TEXT_23 = " model." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static class OpenURIAction extends WorkbenchWindowActionDelegate" + NL + "\t{" + NL + "\t\t/**" + NL + "\t\t * Opens the editors for the files selected using the LoadResourceDialog." + NL + "\t\t * <!-- begin-user-doc -->" + NL + "\t\t * <!-- end-user-doc -->" + NL + "\t\t * @generated" + NL + "\t\t */" + NL + "\t\tpublic void run(IAction action)" + NL + "\t\t{" + NL + "\t\t\tLoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(getWindow().getShell());" + NL + "\t\t\tif (Dialog.OK == loadResourceDialog.open())" + NL + "\t\t\t{" + NL + "\t\t\t\tfor (Iterator i = loadResourceDialog.getURIs().iterator(); i.hasNext();)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\topenEditor(getWindow().getWorkbench(), (URI)i.next());" + NL + "\t\t\t\t}" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static String openFilePathDialog(Shell shell, String fileExtensionFilter, int style)" + NL + "\t{" + NL + "\t\tFileDialog fileDialog = new FileDialog(shell, style);";
  protected final String TEXT_24 = NL + "\t\tif (fileExtensionFilter == null)" + NL + "\t\t{" + NL + "\t\t\tfileExtensionFilter =";
  protected final String TEXT_25 = NL + "  \t\t\t\t\"*.\" + getString(\"_UI_";
  protected final String TEXT_26 = "FilenameExtension\")";
  protected final String TEXT_27 = " + \";\" +";
  protected final String TEXT_28 = ";";
  protected final String TEXT_29 = NL + "\t\t}" + NL + "\t\tfileDialog.setFilterExtensions(new String[]{fileExtensionFilter});";
  protected final String TEXT_30 = NL + NL + "\t\tfileDialog.open();" + NL + "\t\tif (fileDialog.getFileName() != null && fileDialog.getFileName().length() > 0)" + NL + "\t\t{" + NL + "\t\t\treturn fileDialog.getFilterPath() + File.separator + fileDialog.getFileName();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\treturn null;" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static boolean openEditor(IWorkbench workbench, URI fileURI)" + NL + "\t{" + NL + "\t\tIWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();" + NL + "\t\tIWorkbenchPage page = workbenchWindow.getActivePage();" + NL + "" + NL + "\t\tIEditorDescriptor editorDescriptor = workbench.getEditorRegistry().getDefaultEditor(fileURI.toFileString());" + NL + "\t\tif (editorDescriptor == null)" + NL + "\t\t{" + NL + "\t\t\tMessageDialog.openError(" + NL + "\t\t\tworkbenchWindow.getShell()," + NL + "\t\t\tgetString(\"_UI_Error_title\"), ";
  protected final String TEXT_31 = NL + "\t\t\tgetString(\"_WARN_No_Editor\", fileURI.toFileString())); ";
  protected final String TEXT_32 = NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\tpage.openEditor(new URIEditorInput(fileURI), editorDescriptor.getId());" + NL + "\t\t\t}" + NL + "\t\t\tcatch (PartInitException exception)" + NL + "\t\t\t{" + NL + "\t\t\t\tMessageDialog.openError(" + NL + "\t\t\t\tworkbenchWindow.getShell()," + NL + "\t\t\t\tgetString(\"_UI_OpenEditorError_label\"), ";
  protected final String TEXT_33 = NL + "\t\t\t\texception.getMessage());" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\treturn true;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.ui.application.WorkbenchAdvisor#getInitialWindowPerspectiveId()" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic String getInitialWindowPerspectiveId()" + NL + "\t{" + NL + "\t\treturn Perspective.ID_PERSPECTIVE;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.ui.application.WorkbenchAdvisor#initialize(org.eclipse.ui.application.IWorkbenchConfigurer)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void initialize(IWorkbenchConfigurer configurer)" + NL + "\t{" + NL + "\t\tsuper.initialize(configurer);" + NL + "\t\tconfigurer.setSaveAndRestore(true);" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.ui.application.WorkbenchAdvisor#preWindowOpen(org.eclipse.ui.application.IWorkbenchWindowConfigurer)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void preWindowOpen(IWorkbenchWindowConfigurer configurer)" + NL + "\t{" + NL + "\t\tsuper.preWindowOpen(configurer);" + NL + "\t\tconfigurer.setInitialSize(new Point(600, 450));" + NL + "\t\tconfigurer.setShowCoolBar(false);" + NL + "\t\tconfigurer.setShowStatusLine(true);" + NL + "\t\tconfigurer.setTitle(getString(\"_UI_Application_title\"));";
  protected final String TEXT_34 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * @see org.eclipse.ui.application.WorkbenchAdvisor#fillActionBars(org.eclipse.ui.IWorkbenchWindow, org.eclipse.ui.application.IActionBarConfigurer, int)" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void fillActionBars(IWorkbenchWindow window, IActionBarConfigurer configurer, int flags)" + NL + "\t{" + NL + "\t\tsuper.fillActionBars(window, configurer, flags);" + NL + "\t\tif ((flags & FILL_MENU_BAR) != 0)" + NL + "\t\t{" + NL + "\t\t\tfillMenuBar(window, configurer);" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected void fillMenuBar(IWorkbenchWindow window, IActionBarConfigurer configurer)" + NL + "\t{" + NL + "\t\tIMenuManager menuBar = configurer.getMenuManager();" + NL + "\t\tmenuBar.add(createFileMenu(window));" + NL + "\t\tmenuBar.add(createEditMenu(window));" + NL + "\t\tmenuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "\t\tmenuBar.add(createWindowMenu(window));" + NL + "\t\tmenuBar.add(createHelpMenu(window));" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates the 'File' menu." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IMenuManager createFileMenu(IWorkbenchWindow window)" + NL + "\t{" + NL + "\t\tIMenuManager menu = new MenuManager(getString(\"_UI_Menu_File_label\"),";
  protected final String TEXT_35 = NL + "\t\tIWorkbenchActionConstants.M_FILE);    " + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.FILE_START));" + NL + "" + NL + "\t\tIMenuManager newMenu = new MenuManager(getString(\"_UI_Menu_New_label\"), \"new\");";
  protected final String TEXT_36 = " ";
  protected final String TEXT_37 = NL + "\t\tnewMenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "" + NL + "\t\tmenu.add(newMenu);" + NL + "\t\tmenu.add(new Separator());" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "\t\tmenu.add(new Separator());" + NL + "\t\tmenu.add(ActionFactory.CLOSE.create(window));" + NL + "\t\tmenu.add(ActionFactory.CLOSE_ALL.create(window));" + NL + "\t\tmenu.add(new Separator());" + NL + "\t\tmenu.add(ActionFactory.SAVE.create(window));" + NL + "\t\tmenu.add(ActionFactory.SAVE_AS.create(window));" + NL + "\t\tmenu.add(ActionFactory.SAVE_ALL.create(window));" + NL + "\t\tmenu.add(new Separator());" + NL + "\t\tmenu.add(ActionFactory.QUIT.create(window));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.FILE_END));" + NL + "\t\treturn menu;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates the 'Edit' menu." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IMenuManager createEditMenu(IWorkbenchWindow window)" + NL + "\t{" + NL + "\t\tIMenuManager menu = new MenuManager(getString(\"_UI_Menu_Edit_label\"),";
  protected final String TEXT_38 = NL + "\t\tIWorkbenchActionConstants.M_EDIT);" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_START));" + NL + "" + NL + "\t\tmenu.add(ActionFactory.UNDO.create(window));" + NL + "\t\tmenu.add(ActionFactory.REDO.create(window));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.UNDO_EXT));" + NL + "\t\tmenu.add(new Separator());" + NL + "" + NL + "\t\tmenu.add(ActionFactory.CUT.create(window));" + NL + "\t\tmenu.add(ActionFactory.COPY.create(window));" + NL + "\t\tmenu.add(ActionFactory.PASTE.create(window));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.CUT_EXT));" + NL + "\t\tmenu.add(new Separator());" + NL + "" + NL + "\t\tmenu.add(ActionFactory.DELETE.create(window));" + NL + "\t\tmenu.add(ActionFactory.SELECT_ALL.create(window));" + NL + "\t\tmenu.add(new Separator());" + NL + "" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.ADD_EXT));" + NL + "" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.EDIT_END));" + NL + "\t\tmenu.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "\t\treturn menu;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates the 'Window' menu." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IMenuManager createWindowMenu(IWorkbenchWindow window)" + NL + "\t{" + NL + "\t\tIMenuManager menu = new MenuManager(getString(\"_UI_Menu_Window_label\"),";
  protected final String TEXT_39 = NL + "\t\tIWorkbenchActionConstants.M_WINDOW);" + NL + "" + NL + "\t\tmenu.add(ActionFactory.OPEN_NEW_WINDOW.create(window));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "\t\tmenu.add(ContributionItemFactory.OPEN_WINDOWS.create(window));" + NL + "" + NL + "\t\treturn menu;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * Creates the 'Help' menu." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected IMenuManager createHelpMenu(IWorkbenchWindow window)" + NL + "\t{" + NL + "\t\tIMenuManager menu = new MenuManager(getString(\"_UI_Menu_Help_label\"), IWorkbenchActionConstants.M_HELP);";
  protected final String TEXT_40 = NL + "\t\t// Welcome or intro page would go here" + NL + "\t\t// Help contents would go here" + NL + "\t\t// Tips and tricks page would go here" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.HELP_START));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.HELP_END));" + NL + "\t\tmenu.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));" + NL + "\t\treturn menu;" + NL + "\t}" + NL + "}";
  protected final String TEXT_41 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    GenModel genModel = (GenModel)argument;
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_3);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_4);
    stringBuffer.append(genModel.getEditorPluginPackageName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(genModel.getQualifiedEditorPluginClassName());
    stringBuffer.append(TEXT_6);
    genModel.markImportLocation(stringBuffer);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genModel.getEditorAdvisorClassName());
    stringBuffer.append(TEXT_8);
    if (genModel.getCopyrightText() != null) {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genModel.getCopyrightText());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_11);
    }
    stringBuffer.append(TEXT_12);
    stringBuffer.append(genModel.getEditorPluginClassName());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genModel.getQualifiedEditorPluginClassName());
    stringBuffer.append(TEXT_14);
    stringBuffer.append(genModel.getEditorAdvisorClassName());
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genModel.getQualifiedEditorAdvisorClassName());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_18);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(genModel.getModelName());
    stringBuffer.append(TEXT_23);
     List genPackages = genModel.getAllGenPackagesWithClassifiers(); if (!genPackages.isEmpty()) {
    stringBuffer.append(TEXT_24);
    for (Iterator i = genPackages.iterator(); i.hasNext(); ) { GenPackage genPackage = (GenPackage)i.next(); 
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getEditorClassName());
    stringBuffer.append(TEXT_26);
    if (i.hasNext()) {
    stringBuffer.append(TEXT_27);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(genModel.getNonNLS(3));
    } else {
    stringBuffer.append(TEXT_28);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    }
    }
    stringBuffer.append(TEXT_29);
    }
    stringBuffer.append(TEXT_30);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_32);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_34);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_35);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_39);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_40);
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_41);
    return stringBuffer.toString();
  }
}
