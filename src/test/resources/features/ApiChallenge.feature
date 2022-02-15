Feature: As an api user I want to execute request in order to get proper responses


  @Success
  Scenario Outline: Scenario for add books data
    Given A book title
    And a book format
    And a book author
    And a book language
    And a book publication year
    And a book description
    And a book rating
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained.
    And i store the book id.
    Examples:
      | jsonName     | statusCode | operation | entity       |
      | postBooks    | 201        | POST      | POSTBOOK     |


  @Success
  Scenario Outline: Scenario for get book data
    Given a filter sort
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And the expected response is obtained
    Examples:
      | jsonName     | statusCode | operation | entity      |
      | getBooks     | 200        | GET       | GETBOOK     |



  @Success
  Scenario Outline: Scenario for update books data
    Given a book id
    And a book field
    And the new value to the field
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained.
    Examples:
      | jsonName    | statusCode | operation | entity        |
      | patchBooks  | 200        | PATCH     | PATCHBOOK     |

  @Success
  Scenario Outline: Scenario for delete books data
    Given a book id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    Examples:
      | jsonName     | statusCode | operation | entity      |
      | delBooks     | 200        | DELETE    | DELBOOK     |




