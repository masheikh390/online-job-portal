# Online Job Portal

A Java web application where employers post jobs, job seekers search and apply, and admins manage the whole system. Each role has its own dashboard.

Built as a GUVI live project (3rd semester, B.Tech CSE).

## User Roles

| Role | What they can do |
|------|------------------|
| **Admin** | Manage users and roles, approve or reject job postings, manage system settings, view job statistics and user activity |
| **Employer** | Post and manage jobs, review applications, update application status, message applicants, view application statistics |
| **Job Seeker** | Search and filter jobs, apply with resume and cover letter, track application status, manage profile, view job recommendations |

## Tech Stack

- **Backend:** Java, Servlets, JSP
- **Database:** MySQL, accessed through JDBC
- **Frontend:** HTML, CSS, JavaScript, Bootstrap
- **Server:** Apache Tomcat 10.1
- **IDE:** Eclipse IDE for Enterprise Java and Web Developers

## Project Structure

```
OnlineJobPortal
├── src/main/java        # Java classes (model, dao, servlet, util)
├── src/main/webapp      # JSP pages, CSS, JS, images
│   └── WEB-INF/web.xml  # Deployment descriptor
└── README.md
```

## Database Design

Main tables: `users`, `jobs`, `applications`, `messages`, `settings`.

## Requirements

- JDK 21
- Eclipse IDE for Enterprise Java and Web Developers
- Apache Tomcat 10.1
- MySQL Server and MySQL Workbench
- MySQL Connector/J (JDBC driver)

## How to Run

1. Clone or download this repository.
2. In Eclipse, choose **File → Import → Existing Projects into Workspace** and select the project folder.
3. Run jobportal.sql in MySQL Workbench to create the database and tables.
4. Update the database URL, username and password in the `DBConnection` class.
5. Add the MySQL Connector/J `.jar` file to `src/main/webapp/WEB-INF/lib`.
6. Right-click the project and choose **Run As → Run on Server**, then select Tomcat 10.1.
7. Open `http://localhost:8080/OnlineJobPortal/` in your browser.

## Project Status

**Review 1 (in progress):** project structure, database design, JDBC connectivity and UI design.

Planned: login with roles, job posting and approval, job search and apply, application tracking, messaging, statistics.

## Team

| Name | Role | Responsibility |
|------|------|----------------|
| Md Afzal | Team Leader | Project structure, GitHub, JDBC connectivity, integration |
| Gaurav Raj | Team Member | Database design (ER diagram, MySQL tables) |
| Ajit Kumar | Team Member | UI: landing page, login/register, shared layout |
| Aayush Bose | Team Member | UI: dashboards, presentation |

B.Tech CSE, Galgotias University
