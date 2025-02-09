# Gemini Project - Use Case Analysis

## 1. Introduction

This document provides the analysis of two selected use cases for the Gemini Project. Each use case includes a description, an activity diagram, and a sequence diagram. Additionally, a class diagram representing the system's structure is provided.

---

## 2. Use Case 1: Create Observation Schedule

### 2.1 Use Case Description

* **Actor:** Astronomer
* **Goal:** To create, modify, and manage observation schedules.
* **Preconditions:** The user must be authenticated.
* **Postconditions:** The observation schedule is saved and synchronized with the OCS system.
* **Main Flow:**
  1. Astronomer logs into the system.
  2. Selects "Create Observation Schedule."
  3. Inputs observation details (date, time, target, parameters).
  4. System checks for scheduling conflicts.
  5. Astronomer confirms and submits the schedule.
  6. System saves the schedule and synchronizes with OCS.

### 2.2 Activity Diagram

```mermaid
flowchart TD
    A[Start] --> B{User Authenticated?}
    B -- Yes --> C[Select 'Create Observation Schedule']
    C --> D[Input Observation Details]
    D --> E{Check for Conflicts}
    E -- No Conflict --> F[Submit Schedule]
    F --> G[Save Schedule]
    G --> H[Sync with OCS]
    H --> I[End]
    E -- Conflict Detected --> J[Notify User]
    J --> D
    B -- No --> K[Redirect to Login]
    K --> A
```

### 2.3 Sequence Diagram

```mermaid
sequenceDiagram
    participant Astronomer
    participant GeminiSystem
    participant OCS

    Astronomer->>GeminiSystem: Login
    GeminiSystem-->>Astronomer: Authentication Success
    Astronomer->>GeminiSystem: Create Observation Schedule
    GeminiSystem->>Astronomer: Input Observation Details
    Astronomer->>GeminiSystem: Submit Schedule
    GeminiSystem->>GeminiSystem: Check for Conflicts
    GeminiSystem->>OCS: Synchronize Data
    OCS-->>GeminiSystem: Confirmation
    GeminiSystem-->>Astronomer: Schedule Created Successfully
```

---

## 3. Use Case 2: Manage User Accounts

### 3.1 Use Case Description

* **Actor:** System Administrator
* **Goal:** To create, update, and delete user accounts with role-based permissions.
* **Preconditions:** The administrator must be authenticated with admin privileges.
* **Postconditions:** User account changes are updated in the system database.
* **Main Flow:**
  1. Administrator logs into the system.
  2. Navigates to "User Management."
  3. Selects to create, modify, or delete a user.
  4. Inputs user details and role permissions.
  5. System validates the data.
  6. Changes are saved, and confirmation is provided.

### 3.2 Activity Diagram

```mermaid
flowchart TD
    A[Start] --> B{Admin Authenticated?}
    B -- Yes --> C[Access User Management]
    C --> D{Choose Action}
    D -- Create User --> E[Input User Details]
    D -- Modify User --> F[Select and Edit User]
    D -- Delete User --> G[Select User to Delete]
    E --> H[Validate Data]
    F --> H
    G --> H
    H --> I{Validation Successful?}
    I -- Yes --> J[Save Changes]
    J --> K[Confirmation]
    K --> L[End]
    I -- No --> M[Notify Admin of Errors]
    M --> D
    B -- No --> N[Redirect to Login]
    N --> A
```

### 3.3 Sequence Diagram

```mermaid
sequenceDiagram
    participant Admin
    participant GeminiSystem

    Admin->>GeminiSystem: Login
    GeminiSystem-->>Admin: Authentication Success
    Admin->>GeminiSystem: Access User Management
    Admin->>GeminiSystem: Create/Modify/Delete User
    GeminiSystem->>GeminiSystem: Validate Data
    GeminiSystem-->>Admin: Confirmation of Changes
```

---

## 4. Class Diagram

```mermaid
classDiagram
    class User {
        +String username
        +String password
        +String role
        +createAccount()
        +updateAccount()
        +deleteAccount()
    }

    class ObservationSchedule {
        +Date date
        +Time time
        +String target
        +String parameters
        +createSchedule()
        +modifySchedule()
        +deleteSchedule()
    }

    class GeminiSystem {
        +authenticateUser()
        +manageUserAccounts()
        +synchronizeWithOCS()
        +generateReports()
    }

    User --> GeminiSystem
    ObservationSchedule --> GeminiSystem
    GeminiSystem --> OCS
```

---

## 5. Conclusion

This document provides the detailed analysis of two key use cases in the Gemini Project: **Create Observation Schedule** and  **Manage User Accounts** . The activity diagrams, sequence diagrams, and class diagram offer a comprehensive view of the system's structure and interactions.
