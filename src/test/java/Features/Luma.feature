Feature: Check Expedia for cheap travel

  Background:
    Given I am on the Expedia home page

  @Expedia
  Scenario Outline: Check Expedia for cheap air tickets
    When user selects the "<transport>" option and enters their "<origin>" and "<destination>"
    And user enters their "<departing>" and "<return date>"
    And selects the "<number>" of travellers
    And selects their preferred flight "<class>"
    Then clicks search and views the results
    Examples:
      |transport | origin | destination | departing |return date | number | class|
      | plane     | Hello  | destination | this | day | number | classy          |


  @Expedia
    @train
  Scenario Outline: Check Expedia for cheap train tickets
    When user selects the "<transport>" option and enters their "<origin>" and "<destination>"
    And user enters their "<departing>" and "<return date>"
    And selects the "<number>" of travellers

    And selects their preferred flight "<class>"
    Then clicks search and views the results
    Examples:
      |transport| origin | destination | departing | return date | number | class |
      |  train    | Hello  | destination | this | day | number | classy           |
