# QA Portfolio: WordPress E-Commerce Platform Testing (WeLead Bootcamp)

A comprehensive, end-to-end Quality Assurance (QA) project conducted on a WordPress E-Commerce platform. This project showcases structured QA methodologies, spanning from initial planning and manual testing to API validation, database verification, and Selenium UI automation.

---

## 📋 Table of Contents
1. [Project Overview](#-project-overview)
2. [Testing Framework & Deliverables](#-testing-framework--deliverables)
3. [Manual Testing & Defect Tracking](#-manual-testing--defect-tracking)
4. [API & Database Testing](#-api--database-testing)
5. [UI Test Automation (Selenium & POM)](#-ui-test-automation-selenium--pom)
6. [Tools & Technologies](#-tools--technologies)

---

## 🔍 Project Overview
This portfolio demonstrates a professional QA lifecycle implemented on a local WordPress-based e-commerce platform. It simulates the role of a **Test Manager & QA Specialist** responsible for planning, executing, and automating tests to ensure release quality and stability.

---

## 📄 Testing Framework & Deliverables
The project includes a complete suite of standard QA documentation (available under the `documentation/` directory):
*   **D01 System Overview & Test Architecture:** Outlines the system components, boundaries, and testing environment.
*   **D02 Test Wireframes - Screen Map:** Visual representation of user flows and page mappings.
*   **D03 Test Models:** Structured test models defining user paths.
*   **D04 QA Process & Automation Strategy:** Details the workflow, testing entry/exit criteria, and the decision matrix for automation.
*   **D05 & D08 QA WBS & GANTT Timeline:** Work Breakdown Structure (WBS) and Gantt charts defining test scheduling and resource allocation.
*   **D06 Resources Costs & Time Estimation:** Cost planning and effort estimation.
*   **D07 Dependency Analysis (Critical Path):** Analysis of project dependencies.
*   **D09 Resource Usage Matrix (RACI):** Responsibility assignment matrix.
*   **D10 QA Executive Summary:** High-level summary of the testing strategy and outcomes.
*   **D11 & D12 QA Risk List & Risk Management Plan:** Identifies potential risks and outlines mitigation strategies.

---

## 🛠️ Manual Testing & Defect Tracking
Manual testing focused on critical user flows to validate functional correctness and user experience:
*   **56 Test Cases:** Covering User Registration, Login/Logout, Product Search & Filtering, Shopping Cart Operations, Checkout Process, and Admin Dashboard Order Management.
*   **16 Gherkin Scenarios:** Written in BDD format to bridge requirements with automated test scripts.
*   **13 Logged Defects:** A detailed defect log detailing steps to reproduce, expected vs. actual outcomes, severity, and priority.

---

## 🌐 API & Database Testing
*   **11 API Test Scenarios (Postman):** Validates WooCommerce/WordPress REST API endpoints (GET, POST, PUT, DELETE) covering User Profile (`/users/me`), User Management (`/users`), and Posts (`/posts`) along with JWT/Session Authentication and security validations.
*   **3 SQL/Database Test Cases:** Checks backend data integrity, record creation, and relational database constraints.

---

## 🤖 UI Test Automation (Selenium & POM)
The automated regression suite is built using **Java, JUnit 5, and Selenium WebDriver** and consists of **16 automated test cases**:
*   **Page Object Model (POM):** Implemented to separate page representation from test logic, ensuring maintainability.
    *   `LoginPage.java` - Encapsulates selectors and actions for user login.
    *   `ProductPage.java` - Encapsulates actions for navigating products and adding items to the cart.
*   **Cross-Browser Testing Suite:** Contains dedicated test classes for cross-browser validation of authentication flows:
    *   `WordPressChromeTest.java` - Executes login regression tests on Google Chrome (Admin, Author, Subscriber, and boundary/error cases).
    *   `WordPressFirefoxTest.java` - Executes the same login regression suite on Mozilla Firefox.
*   **Automated Scenarios:**
    *   User Login (Valid/Invalid Credentials across multiple user roles: Admin, Author, Subscriber).
    *   Add to Cart functionality.

---

## 🛠️ Tools & Technologies
*   **Programming Language:** Java, SQL
*   **Test Automation:** Selenium WebDriver, JUnit 5, WebdriverManager
*   **API Testing:** Postman
*   **Project & Defect Management:** Jira, Microsoft Excel
*   **Build Tool:** Maven
*   **Web Server Environment:** Apache, MySQL (WAMP/XAMPP), WordPress
