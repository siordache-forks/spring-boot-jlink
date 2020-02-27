module testjlink {
    //requires static lombok;

    requires spring.boot;
    requires spring.boot.autoconfigure;

    exports com.example.testjlink;
    opens com.example.testjlink;
}