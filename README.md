# CRM System
## Project Overview
This is a team project focused on developing and maintaining a comprehensive CRM (Customer Relationship Management) system. It allows administrators to efficiently manage organizations, branches, schedules, client databases, services, employees, and ensure data security. The system also automatically records client visit history, providing a robust solution for business management.
http://ec2-56-228-80-43.eu-north-1.compute.amazonaws.com:8080/swagger-ui/index.html

## Key Features and Functionality
Here are the main features and components of the system, developed by our team:

### Admin and Settings Module
1. Event Types Management
   - Description: Allows administrators to create, configure, and manage various service formats.
   - Functionality:
      - Editing event lists: creating, duplicating, deleting. 
      - Event configuration: editing event names.

2. Client Profile
   - Description: Enables administrators to view and update client information.

   - Functionality:
      - Client information: editing name, phone number, date of birth, and additional information.
      - Visit history: viewing. 
      - Subscriptions: viewing active/inactive subscriptions, creating new ones.

3. Organization Management
   - Description: Allows administrators to manage organization information.
   - Functionality: Creating, editing, and deleting organizations.

4. Branch Management
   - Description: Allows administrators to manage organization branches.
   - Functionality: Creating, editing, and deleting branches; configuring basic branch parameters.

5. Schedule Management
   - Description: Allows administrators to manage the schedule of events.
   - Functionality: Creating, editing, and deleting events in the schedule.

6. Employee Management
   - Description: Allows administrators to create and configure the employee list.
   - Functionality: Adding, editing, and deleting employee information.

7. Services Management
   - Description: Allows administrators to create and configure the list of services provided.
   - Functionality: Adding, editing, and deleting services.

8. One-Time Visits
   - Description: Allows administrators to set prices for one-time visits.
   - Functionality: Setting and editing prices.

9. Service Subscriptions
   - Description: Allows administrators to create and configure service subscriptions. 
   - Functionality: Adding, editing, and deleting subscriptions.

10. Schedule
    - Description: Ability to plan the time and location of events, as well as assign employees. 
    - Functionality: Populating the event schedule.

### Client Management Functionality
1. Client Database
   - Description: A centralized repository for client information. 
   - Functionality: Viewing, searching, and filtering clients.

2. Client Enrollment
   - Description: Ability to enroll a client for an event. 
   - Functionality: Assigning clients to specific events in the schedule.

3. Automatic Visit History Logging
   - Description: The system automatically records client visits or missed sessions in the database. 
   - Result: Ensures an up-to-date and complete history of client interactions with services, improving record-keeping and analytics.

4. Client Billing
   - Description: Functionality for billing clients for provided services. 
   - Functionality: Processing payments and financial transactions.

5. Clients List
   - Description: A convenient overview of all registered clients. 
   - Functionality: Displaying a list of clients with basic information.

6. Import Clients
   - Description: Ability to import clients into the database. 
   - Functionality: Uploading client data from external sources.

7. Export Clients
   - Description: Ability to export the client database. 
   - Functionality: Downloading client data for analysis or use in other systems.

### System Components and Tools
1. OpenAPI - Swagger Integration
   - Description: Configuration and integration of the OpenAPI (Swagger) toolset for automatic generation of interactive API documentation. 
   - Result: Provides a convenient way for developers to test and interact with the API, as well as understand its structure.

2. Error Format Configuration
   - Description: Implementation of a standardized format for displaying and handling errors within the system. 
   - Result: Improved error handling, making the system more stable and predictable, and simplifying debugging.

3. Organization Pre-moderation
   - Description: Development of functionality for administrators to pre-moderate (approve or reject) new organizations in the system. 
   - Functionality: Added an endpoint that sets or removes the "access allowed" flag for an organization.

4. DTO Validation
   - Description: Implementation of validation mechanisms for all Data Transfer Objects (DTOs) in the system. 
   - Functionality: Added validation for fields such as email, name, phone number, etc., to ensure data integrity and correctness.

5. Filters
   - Description: Functionality for filtering events in the schedule. 
   - Functionality: Allows quickly finding desired events based on various criteria.

6. Organizations Listing (Super Admin View)
   - Description: A special interface for the super administrator to view and manage all registered organizations. 
   - Functionality: Centralized control over organizations within the system.

7. Spring Security Integration
   - Description: Implementation of the Spring Security framework to ensure authentication, authorization, and protection of system resources. 
   - Result: Enhanced application security and access control to various functionalities.

## Team Contribution
This project is the result of our team's collaborative work. Each member has made significant contributions to the implementation of the functionalities described above, allowing us to create a complete and functional system.

## License
This project is intended for demonstration purposes in my portfolio only. All code is protected by copyright.

You are free to view and clone the repository to review the code. However, you are not permitted to modify, distribute, or use this code or any part of it in any other project (commercial or non-commercial) without my explicit written consent.