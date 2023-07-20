module m_new_version_updates{

    exports com.cydeo.java9;//By this line we define that this module exports only java9 package. We encapsulate/hide other modules. Even if we add dependency of this module to another module that module can use only java9 package.

        }