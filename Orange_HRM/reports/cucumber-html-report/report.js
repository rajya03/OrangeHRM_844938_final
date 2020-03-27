$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/testcase.feature");
formatter.feature({
  "line": 2,
  "name": "OrangeHRM Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@OrangeHRM_Feature"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "To check that the application is taking the valid credentials.",
  "description": "",
  "id": "orangehrm-website;to-check-that-the-application-is-taking-the-valid-credentials.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Tc_01_OrangeHRMLogin"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user open the orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enter the username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user submit the details",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRM_Login_step.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 17265338413,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_step.user_open_the_orange_hrm_login_page()"
});
formatter.result({
  "duration": 4154266770,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_step.user_enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 13553533829,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Login_step.user_submit_the_details()"
});
formatter.result({
  "duration": 5936347486,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "To Check if the application is searching candidate details in the Recruitment page.",
  "description": "",
  "id": "orangehrm-website;to-check-if-the-application-is-searching-candidate-details-in-the-recruitment-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Tc_02_searching_candidate_details"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user Open the orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Enter the username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "user Submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user searching the candidate details",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRM_Recruitment_step.user_Launch_the_chrome_browser()"
});
formatter.result({
  "duration": 6469124233,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Recruitment_step.user_Open_the_orange_hrm_login_page()"
});
formatter.result({
  "duration": 3951540422,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Recruitment_step.user_Enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 507146926,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Recruitment_step.user_Submit_the_details()"
});
formatter.result({
  "duration": 1843960249,
  "status": "passed"
});
formatter.match({
  "location": "OrangeHRM_Recruitment_step.user_searching_the_candidate_details()"
});
formatter.result({
  "duration": 8954157996,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "To check if the application is reset the candidate details in the Recruitment page.",
  "description": "Reset Candidate details in the Recruitment page",
  "id": "orangehrm-website;to-check-if-the-application-is-reset-the-candidate-details-in-the-recruitment-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Tc_03_reset_candidate_details"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "the user Launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "the user Open the orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the user Enter the username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "the user Submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the user reset the candidate details",
  "keyword": "Then "
});
formatter.match({
  "location": "recruit_reset_step.the_user_Launch_the_chrome_browser()"
});
formatter.result({
  "duration": 6458965452,
  "status": "passed"
});
formatter.match({
  "location": "recruit_reset_step.the_user_Open_the_orange_hrm_login_page()"
});
formatter.result({
  "duration": 2996344031,
  "status": "passed"
});
formatter.match({
  "location": "recruit_reset_step.the_user_Enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 294556349,
  "status": "passed"
});
formatter.match({
  "location": "recruit_reset_step.the_user_Submit_the_details()"
});
formatter.result({
  "duration": 2075788356,
  "status": "passed"
});
formatter.match({
  "location": "recruit_reset_step.the_user_reset_the_candidate_details()"
});
formatter.result({
  "duration": 7174812061,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "To check that the application add another Candidate details in the Recruitment page.",
  "description": "",
  "id": "orangehrm-website;to-check-that-the-application-add-another-candidate-details-in-the-recruitment-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Tc_04_add_another_candidate_details"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "User Launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "User Open the orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "User Enter the username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user should Submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "user Searching the candidate details",
  "keyword": "Then "
});
formatter.step({
  "line": 39,
  "name": "add another candidate details",
  "keyword": "And "
});
formatter.match({
  "location": "recruit_add_step.user_Launch_the_chrome_browser()"
});
formatter.result({
  "duration": 6464909999,
  "status": "passed"
});
formatter.match({
  "location": "recruit_add_step.user_Open_the_orange_hrm_login_page()"
});
formatter.result({
  "duration": 2761112356,
  "status": "passed"
});
formatter.match({
  "location": "recruit_add_step.user_Enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 264990912,
  "status": "passed"
});
formatter.match({
  "location": "recruit_add_step.user_should_Submit_the_details()"
});
formatter.result({
  "duration": 2383185319,
  "status": "passed"
});
formatter.match({
  "location": "recruit_add_step.user_Searching_the_candidate_details()"
});
formatter.result({
  "duration": 6466040409,
  "status": "passed"
});
formatter.match({
  "location": "recruit_add_step.add_another_candidate_details()"
});
formatter.result({
  "duration": 3743700753,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "To check that the application  Searching Vacancies in the Recruitment page.",
  "description": "",
  "id": "orangehrm-website;to-check-that-the-application--searching-vacancies-in-the-recruitment-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@Tc_05_search_vacancies"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "User launch the chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "User open the orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "User enter the username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "User submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 48,
  "name": "User searching the vacancies",
  "keyword": "Then "
});
formatter.match({
  "location": "recruit_vacancies_step.user_launch_the_chrome_browser()"
});
formatter.result({
  "duration": 8105577409,
  "status": "passed"
});
formatter.match({
  "location": "recruit_vacancies_step.user_open_the_orange_hrm_login_page()"
});
formatter.result({
  "duration": 3416872460,
  "status": "passed"
});
formatter.match({
  "location": "recruit_vacancies_step.user_enter_the_username_and_password_with_valid_data()"
});
formatter.result({
  "duration": 395483603,
  "status": "passed"
});
formatter.match({
  "location": "recruit_vacancies_step.user_submit_the_details()"
});
formatter.result({
  "duration": 2072485545,
  "status": "passed"
});
formatter.match({
  "location": "recruit_vacancies_step.user_searching_the_vacancies()"
});
formatter.result({
  "duration": 6275551171,
  "status": "passed"
});
formatter.scenario({
  "line": 51,
  "name": "To check that the application add candidate details in vacancies in the recruitment page.",
  "description": "",
  "id": "orangehrm-website;to-check-that-the-application-add-candidate-details-in-vacancies-in-the-recruitment-page.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 50,
      "name": "@Tc_06_add_vacancies_candidate_details"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User Launch the Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "User Open the Orange hrm login page",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "User Enter the Username and password with valid data",
  "keyword": "Then "
});
formatter.step({
  "line": 56,
  "name": "user Should Submit the details",
  "keyword": "Then "
});
formatter.step({
  "line": 57,
  "name": "user Searching the Candidate details",
  "keyword": "Then "
});
formatter.step({
  "line": 58,
  "name": "add candidate details",
  "keyword": "And "
});
formatter.match({
  "location": "recruit_vacancies_add_step.user_Launch_the_Chrome_browser()"
});
formatter.result({
  "duration": 60764823329,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: DevToolsActivePort file doesn\u0027t exist\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-UK98VR9\u0027, ip: \u0027192.168.0.105\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x01520C83+1707139]\n\tOrdinal0 [0x014868F1+1075441]\n\tOrdinal0 [0x013FDFC9+516041]\n\tOrdinal0 [0x0138FB81+64385]\n\tOrdinal0 [0x0138CC5B+52315]\n\tOrdinal0 [0x013ABFD7+180183]\n\tOrdinal0 [0x013ABDDD+179677]\n\tOrdinal0 [0x013A9D4B+171339]\n\tOrdinal0 [0x01391D4A+73034]\n\tOrdinal0 [0x01392DC0+77248]\n\tOrdinal0 [0x01392D59+77145]\n\tOrdinal0 [0x0149BB67+1162087]\n\tGetHandleVerifier [0x015BA966+508998]\n\tGetHandleVerifier [0x015BA6A4+508292]\n\tGetHandleVerifier [0x015CF7B7+594583]\n\tGetHandleVerifier [0x015BB1D6+511158]\n\tOrdinal0 [0x0149402C+1130540]\n\tOrdinal0 [0x0149D4CB+1168587]\n\tOrdinal0 [0x0149D633+1168947]\n\tOrdinal0 [0x014B5B35+1268533]\n\tBaseThreadInitThunk [0x74978744+36]\n\tRtlGetAppContainerNamedObjectPath [0x77ED58ED+253]\n\tRtlGetAppContainerNamedObjectPath [0x77ED58BD+205]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat Com.pages.recruit_vacancies_add_pages.ChromeLaunch(recruit_vacancies_add_pages.java:70)\r\n\tat Com.Stepdefinition.recruit_vacancies_add_step.user_Launch_the_Chrome_browser(recruit_vacancies_add_step.java:14)\r\n\tat ✽.Given User Launch the Chrome browser(src/main/resources/feature/testcase.feature:53)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "recruit_vacancies_add_step.user_Open_the_Orange_hrm_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "recruit_vacancies_add_step.user_Enter_the_Username_and_password_with_valid_data()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "recruit_vacancies_add_step.user_Should_Submit_the_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "recruit_vacancies_add_step.user_Searching_the_Candidate_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "recruit_vacancies_add_step.add_candidate_details()"
});
formatter.result({
  "status": "skipped"
});
});