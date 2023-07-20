module m_optional_bigdecimal {

    requires m_new_version_updates; //Here we said that we need to use this module and at the same time to use this module we add its dependency to pom.xml file. But even if we do that we can only use the accessible packages that is at the other module's module info file.
}