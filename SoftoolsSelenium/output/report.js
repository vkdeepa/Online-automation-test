$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/Features/Workspace.feature");
formatter.feature({
  "name": "Workspace",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Workspace"
    }
  ]
});
formatter.scenario({
  "name": "Add Record",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Workspace"
    },
    {
      "name": "@AddRecord"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enters credentials to login and clicks submit button",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "autouser1",
        "Perfection@1"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition.login_With_Credentials(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition.verify_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open AppStudio",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.open_Appstudio()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open Workspace",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.open_Workspace()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search and Find the app",
  "rows": [
    {
      "cells": [
        "Title"
      ]
    },
    {
      "cells": [
        "Automation Sample 1"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.search_App_Workspace(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Records",
  "rows": [
    {
      "cells": [
        "Record1",
        "Record2"
      ]
    },
    {
      "cells": [
        "2",
        "emp2"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition.enter_Record(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether records are entered",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition.verify_Records()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});