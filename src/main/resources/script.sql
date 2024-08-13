create table Departments
(
    id          bigserial primary key,
    name        varchar(128),
    description TEXT
);

create table Positions
(
    id          bigserial primary key,
    name        varchar(128),
    description text
);

create table Employees
(
    id            bigserial primary key,
    name          varchar(128) not null,
    surname       varchar(128) not null,
    position_id   int          references Positions (id) on delete set null,
    department_id int          references Departments (id) on delete set null
);

create table Projects
(
    id          bigserial primary key,
    name        varchar(128) not null,
    description text,
    start_date  date,
    end_date    date
);

create table Assignments
(
    id            bigserial primary key,
    employee_id   int references Employees (id) on delete cascade,
    project_id    int references Projects (id) on delete cascade,
    assigned_date DATE NOT NULL,
    role          VARCHAR(100)
);

drop table Assignments;
drop table Projects;
drop table Positions;
drop table Employees;
drop table Departments;

INSERT INTO Departments (name, description)
VALUES ('Executive', 'Company leadership'),
       ('Engineering', 'Technical department responsible for software development'),
       ('HR', 'Human Resources department'),
       ('Sales', 'Sales and business development'),
       ('Marketing', 'Marketing and advertising activities');



INSERT INTO Positions (name, description)
VALUES ('CEO', 'Chief Executive Officer (Head of the company)'),
       ('CTO', 'Chief Technology Officer (Head of technology)'),
       ('VP of Engineering', 'Vice President of Engineering'),
       ('Engineering Director', 'Director of Engineering'),
       ('Engineering Manager', 'Manager of Engineering teams'),
       ('Team Lead', 'Leader of a software development team'),
       ('Senior Software Engineer', 'Senior software developer'),
       ('Software Engineer', 'Software developer'),
       ('Junior Software Engineer', 'Junior software developer'),
       ('Intern', 'Internship position for trainees'),
       ('HR Director', 'Head of Human Resources'),
       ('HR Manager', 'Human Resources Manager'),
       ('HR Specialist', 'Human Resources Specialist'),
       ('Recruiter', 'Specialist in hiring new employees'),
       ('HR Assistant', 'Assistant in Human Resources department'),
       ('Sales Director', 'Head of Sales department'),
       ('Sales Manager', 'Manager in Sales department'),
       ('Marketing Director', 'Head of Marketing department'),
       ('Marketing Specialist', 'Marketing activities specialist');


INSERT INTO Employees (name, surname, position_id, department_id)
VALUES ('John', 'Doe', 1, 1),
       ('Jane', 'Smith', 2, 2),
       ('Michael', 'Brown', 3, 2),
       ('Emily', 'Davis', 4, 2),
       ('David', 'Wilson', 5, 2),
       ('Sophia', 'Miller', 6, 2),
       ('Daniel', 'Taylor', 7, 2),
       ('Olivia', 'Moore', 8, 2),
       ('James', 'Anderson', 9, 2),
       ('Isabella', 'Jackson', 10, 2),
       ('Sarah', 'Johnson', 11, 3),
       ('Robert', 'White', 12, 3),
       ('Linda', 'Clark', 13, 3),
       ('Karen', 'Lewis', 14, 3),
       ('Barbara', 'Lee', 15, 3),
       ('Kevin', 'Walker', 16, 4),
       ('Laura', 'Hall', 17, 4),
       ('Thomas', 'Young', 18, 5),
       ('Nancy', 'King', 19, 5);

INSERT INTO Projects (name, description, start_date, end_date)
VALUES ('Project Alpha', 'Development of a new product line', '2024-01-01', '2024-12-31'),
       ('Project Beta', 'Upgrade of the existing platform', '2024-03-01', '2024-09-30'),
       ('Project Gamma', 'Expansion into new market segments', '2024-06-01', '2025-02-28'),
       ('Project Delta', 'Internal system overhaul', '2024-04-15', '2024-11-15');


INSERT INTO Assignments (employee_id, project_id, assigned_date, role)
VALUES (3, 1, '2024-01-15', 'Project Manager'),
       (4, 1, '2024-01-15', 'Lead Engineer'),
       (7, 1, '2024-01-20', 'Senior Developer'),
       (8, 1, '2024-01-20', 'Software Engineer'),
       (9, 2, '2024-03-01', 'Junior Developer'),
       (5, 2, '2024-03-01', 'Engineering Manager'),
       (10, 2, '2024-03-05', 'Intern'),
       (16, 3, '2024-06-10', 'Sales Lead'),
       (12, 3, '2024-06-10', 'HR Manager'),
       (14, 4, '2024-04-20', 'Recruiter'),
       (18, 4, '2024-04-20', 'Marketing Lead');