* TODO:
<?xml version="1.0" encoding="UTF-8"?>
<setup:Configuration
    xmi:version="2.0"
    xmlns:xmi="http://www.omg.org/XMI"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:setup="http://www.eclipse.org/oomph/setup/1.0"
    label="EMF Development Environment">
  <annotation
      source="http://www.eclipse.org/oomph/setup/BrandingInfo">
    <detail
        key="imageURI">
      <value>https://www.eclipse.org/modeling/emf/images/emf_logo.png</value>
    </detail>
    <detail
        key="siteURI">
      <value>https://www.eclipse.org/modeling/emf/</value>
    </detail>
  </annotation>
  <installation
      name="emf.development.environment.installation"
      label="EMF Development Environment Installation">
    <productVersion
        href="index:/org.eclipse.setup#//@productCatalogs[name='org.eclipse.products']/@products[name='epp.package.committers']/@versions[name='latest']"/>
    <description>The EMF development environment installation provides the full development environment for working with EMF.</description>
  </installation>
  <workspace
      name="emf.development.environment.workspace"
      label="EMF Development Environment Workspace">
    <setupTask
        xsi:type="setup:VariableTask"
        name="eclipse.target.platform"
        value="${eclipse.target.platform.latest}"/>
    <stream
        href="index:/org.eclipse.setup#//@projectCatalogs[name='org.eclipse']/@projects[name='emf']/@projects[name='core']/@streams[name='master']"/>
    <stream
        href="index:/org.eclipse.setup#//@projectCatalogs[name='org.eclipse']/@projects[name='emf']/@projects[name='gwt']/@streams[name='master']"/>
    <stream
        href="index:/org.eclipse.setup#//@projectCatalogs[name='org.eclipse']/@projects[name='emf']/@projects[name='rap']/@streams[name='master']"/>
    <stream
        href="index:/org.eclipse.setup#//@projectCatalogs[name='org.eclipse']/@projects[name='emf']/@projects[name='xcore']/@streams[name='master']"/>
    <description>The EMF development environment workspace includes the Core, RAP, GWT, Xcore, ODA, Releng, and XSD.</description>
  </workspace>
  <description>
    &lt;p>
    The &lt;a href=&quot;https://www.eclipse.org/modeling/emf&quot;/>EMF&lt;/a> Development Environment configuration provisions a dedicated development environment 
    for the complete set of source projects used by &lt;a href=&quot;https://ci.eclipse.org/emf/&quot;>EMF's build server&lt;/a> 
    to produce &lt;a href=&quot;https://download.eclipse.org/modeling/emf/emf/builds/&quot;>EMF's update sites&lt;/a>.
    &lt;/p>
    &lt;p>
    All the source projects from &lt;a href=&quot;https://github.com/eclipse-emf/org.eclipse.emf&quot;>EMF's Git Repository&lt;/a>
    are available, organized into working sets, and ready for contribution.
    &lt;/p>
    &lt;p>
    Please &lt;a href=&quot;https://wiki.eclipse.org/Eclipse_Platform_SDK_Provisioning&quot;>read the analgous tutorial instructions&lt;/a> for the Eclispe Platform SDK's configuration for more details.
    &lt;/p>
  </description>
</setup:Configuration>
