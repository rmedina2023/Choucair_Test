package pages;


public class New_User_Screen extends ScreenPlay {
//Locators
//WebSide Lobby locators
    private String joinButton = "//unauthenticated-header/div[1]/div[3]/ul[2]/li[2]/a[1]";
//General Information Locators
    private String nameTextBox = "//input[@id='firstName']";
    private String lastNameTextBox = "//input[@id='lastName']";
    private String emailTextBox = "//input[@id='email']";
    private String birthMonthBox = "//select[@id='birthMonth']";
    private String birthDayBox = "//select[@id='birthDay']";
    private String birthYearBox = "//select[@id='birthYear']";
    private String nextLocationButton = "//span[contains(text(),'Next: Location')]";
//Location Locators
    private String zipCodeTextBox = "//input[@id='zip']";
    private String nextDevicesButton = "//span[contains(text(),'Next: Devices')]";
//Devices Locators
    private String lastStepButton = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]";
//Last Step Locators   
    private String passwordTextBox = "//input[@id='password']";
    private String confirmPasswordTextBox = "//input[@id='confirmPassword']";
    private String termsCheckBox = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]";
    private String policiesCheckBox = "//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]";
    private String completeButton = "//a[@id='laddaBtn']";

 //Screen model
    public New_User_Screen(){
        super(driver);
    }
    
//Navigate to the Utest Website
    public void navigateToUtestWebsite(){
        navigateTo("https://www.utest.com/");
    }

//Click on Join Today button
    public void clickJoinTodayButton(){
        clickElement(joinButton);
    }

//Introduce the New User General Information
    public void introduceGeneralInformation(){
        //Type the information
        write(nameTextBox,"Ramon");
        write(lastNameTextBox,"Medina");
        write(emailTextBox, "ramonamn1206@gmail.com");
       
        //Select the elements from the dropdown list
        selectFromDropdownByText(birthMonthBox,"June");
        selectFromDropdownByText(birthDayBox, "12");
        selectFromDropdownByText(birthYearBox, "1997");
    }

    public void clickNextLocation(){
        //Click on Next Button
        clickElement(nextLocationButton);

    }

    public void introduceLocationInformation(){
        write(zipCodeTextBox,"7083");

    }

    public void clickNextDevices(){
        clickElement(nextDevicesButton);
    }

    public void clickLastStep(){
        clickElement(lastStepButton);
    }

    public void introducePassword(){
        write(passwordTextBox,"Abcdefgh1234567890");
        write(confirmPasswordTextBox,"Abcdefgh1234567890");
        clickElement(termsCheckBox);
        clickElement(policiesCheckBox);
    }

    public void clickComplete(){
        clickElement(completeButton);
    }


}
