Feature: Search Coupon

  Background:
    Given User enters the coupon website
  @multipleSearchResult
  Scenario Outline: multiple search results
  #  Given  user enters the coupon website
    When you enter your <document number>
    And I'm looking for a <specific general>
    Then you should see the list and the detail of the coupon

    Examples:
      | document number | specific general |
      | 72209308        | dsct             |

  @singleSearchResult
  Scenario Outline: a single search result
   # Given  user enters the coupon website
    When you enter your <document number>
    And I'm looking for a <specific product>
    Then you should see the detail of the coupon

    Examples:
      | document number | specific product |
      | 76970646        | selectum         |

  @searchNotFound
  Scenario Outline: Product not found
   # Given user enters the coupon website
    When you enter your <document number>
    And you search for a <specific product> and find it
    Then you should see an information message

    Examples:
      |document number|specific product|
      |76970646       |pepino         |