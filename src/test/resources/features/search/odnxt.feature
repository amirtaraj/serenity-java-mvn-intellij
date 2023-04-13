Feature: ODNxt Dashboard

  Scenario: Dashboard Page
    Given Client wants to access the Homepage
    When he selects the option with ID "select_fiscalYear" in the dropdown "2023"
    Then he should see the option "select_fiscalYear" selected in the dropdown with ID "2023"
    When Client clicks the element with ID "th_reviewId_1001"
    Then he should see information about "1001"
    When Client clicks the element with ID "lnk_menu_dashboard"
    When Client clicks the element with ID "lnk_new_viewall"
    Then he should see details about "Review Key"



  Scenario:  Candidate Pool Page
    Given Client wants to access the Homepage
    When Client clicks the element with ID "lnk_menu_cp"
    When he selects the option with ID "select_fiscalYear" in the dropdown "2023"
    Then he should see the option "select_fiscalYear" selected in the dropdown with ID "2023"
    When Client clicks the element with ID "th_cp_1001"
    When Client clicks the element with ID "th_cp_1002"
    When Client clicks the element with ID "th_cp_1001"
    When Client clicks the element with ID "th_cp_1002"

  Scenario:  Review Queue Page
     Given Client wants to access the Homepage
     When Client clicks the element with ID "lnk_menu_rq"
     When Client clicks the element with ID "th_reviewId_1001"
     Then he should see information about "1001"


