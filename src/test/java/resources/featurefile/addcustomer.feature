Feature: Add customer

  @Regression
  Scenario: verify bank manager should be able to add customer successfully
    Given   I am on homepage
    When    I click on bank manager login
    Then    I click on add customer
    And     I add fisrtname"Ram"
    And     I add lastname"patel"
    And     I add postcode"HA25"
    When    I should add customer successfully


  Scenario: verify customer should be able to login and logout successfully
    Given I am on homepage
    When  I click on customer login link
    And  I click and select customer in search field"<searchField>"
    And   I click on login button
    Then  I click on log out button


  Scenario: verify customer should deposite money successfully
    Given I am on homepage
    When  I click on customer login link
    And    And  I click and select customer  search field"<searchField>"

    And    I click on login button
    And    I click on deposite tab
    And    I entred deposit ammount(100);
    And    I click on deposite button
    Then   I could see message "Deposit Successful"

@Smoke
  Scenario: verify customer should be able to withdrow money successfuly
    Given I am on homepage
    When  I click on customer login link
    And    And  I click and select customer  search field"<searchField>"

    And    I click on login button
    And          I click on witdrow tab
    And          I enter withdrow amount"<String amt>"
    Then         I click on witdrow button