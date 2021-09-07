Feature: Update

  Background:
    Given User enters the coupon web page

   @updateValidData
  Scenario Outline: data update with valid data
   # Given The user enters the coupon web page
    When he sends his <document number> and his <phone> and his <email> with valid data
    Then system allows you to update your data
    Examples:
      | document number | phone | email |
      | 47556330 | 944088167 | jcont123@gmail.com |

   @updateInvalidData
  Scenario Outline: data update with invalid data
    #Given The user enters the coupon web page
    When he sends his <document number> and his <phone> and his <email> with invalid data
    Then system shows you error messages
    Examples:
      | document number | phone | email |
      | 48131700 | A33781281 | juliitoh18@@gmail.com |