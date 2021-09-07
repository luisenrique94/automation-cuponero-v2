Feature: Login into the application


  Background:
    Given User enters the coupon website
  #  When  sends number document <number>

  @loginSuccess
  Scenario Outline: successful login
# Given User enters the coupon website
    When  sends number document <number>
    Then  should be able to view her coupons
    Examples:
      | number   |
      | 72209308 |

  @loginFailed
  Scenario Outline:failed login
    #Given User enters the coupon website
    When sends invalid document <number>
    Then should be able to see error message
    Examples:
      | number |
      | 000000 |
     # | 014785 |
     # | 12898    |

  @userNotRegistered
  Scenario Outline:user not registered
   # Given User enters the coupon website
    When sends  document <number>
    Then should be able to see the registration modal
    Examples:
      |number|
      | 00447711|







