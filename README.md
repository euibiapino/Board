## 📋 Project: Task Management Board
This project is a task management system with customizable boards, developed as part of a practical challenge. It allows the creation, visualization, and control of tasks, with registration in a MySQL database.

## 🧱 Features
Main menu with options to Create, Select, Delete boards, and for the user to exit.

Each board has:
- Unique name;
- At least 3 columns: initial, final (completed) and cancellation;
- Optional "pending" type columns;
- Fixed order: Initial → Pending → Final → Cancellation (as exception);

Each card (task):
- Has title, description, creation date and blocking status;
- Can be blocked or unblocked with justification;
- Can only be moved if not blocked;
- Can be moved step by step (except to cancellation, which accepts jumps);

## 🛠️ Technologies
Java, MySQL, JDBC

## 📄 License
This project was created as a practical challenge submission for DIO (Digital Innovation One). Educational use.
