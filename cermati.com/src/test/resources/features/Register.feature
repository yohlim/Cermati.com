@All
Feature: register succes

  @positive @register @gabung
  Scenario: Success to register
    Given User is on sign up page
    Then user input field Nomor Handphone
    And user input field email
    And user input nama depan
    And user input nama belakang
    And user click button daftar
