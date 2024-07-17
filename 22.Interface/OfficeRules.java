interface OfficeRules {
    int no_of_leave = 10;// by default public static final
    int min_salary = 20000;// by default public static final

    void work_8_hours();// by default, public and abstract

    void wear_formals();

    void get_salary();

    void apply_leave();// public abstarct

    // a methods cannot be both abstract and final
    // we can access any variable with classname


}