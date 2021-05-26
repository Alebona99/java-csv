Feature: Action on file .csv
  A user have a file .csv, and
  he want to convert in .json file

  Scenario Outline: file Csv to Json
    Given user have file
    When  insert file CSV "<file>"
    Then  convert the file and see content with first method
    #after create a new file of output "output.json"

    Examples:

    | file                                  |
    | /home/alessio/Downloads/biostats.csv  |
    | /home/alessio/Downloads/empty.csv     |
    | /home/alessio/Downloads/sur.css       |
    | /home/alessio/Downloads/surprise.text |
    | /home/alessio/Downloads/              |
    | null                                  |
    | home                                  |
    | 1234                                  |
    | home23                                |


  Scenario Outline: file Csv to Json
    Given user have file
    When  insert file CSV "<file>"
    Then   convert the file and see content with second method
    #after create a new file of output "prova.json"

    Examples:

      | file                                  |
      | /home/alessio/Downloads/biostats.csv  |
      | /home/alessio/Downloads/empty.csv     |
      | /home/alessio/Downloads/sur.css       |
      | /home/alessio/Downloads/surprise.text |
      | /home/alessio/Downloads/              |
      | null                                  |
      | home                                  |
      | 1234                                  |
      | home23                                |

