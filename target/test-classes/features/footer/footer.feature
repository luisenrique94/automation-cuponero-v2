Feature: FOOTER

  Background:
    Given that the user enters the couponero website
  @footer
  Scenario: Frequently Asked Questions
#    Given that the user enters the couponero website
    When he clicks on frequently asked questions
    Then he visualizes the frequently asked questions shown by the system

  @footer
  Scenario: Terms and Conditions
 #   Given that the user enters the couponero web site
    When he clicks on terms and conditions
    Then he sees the terms and conditions modal
