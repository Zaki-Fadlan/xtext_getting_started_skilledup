## Getting Started

### Prerequisites

- Java JDK (version 17.0.7) 2023-04-18 LTS
- Eclipse IDE for Java Developers-2023-06
- Xtext and Xtend plugins for Eclipse

### Installation

1. Clone this repository to your local machine using the following command:

    ```https://github.com/Zaki-Fadlan/xtext_getting_started_skilledup.git```

2. Import the project into Eclipse:

   - Open Eclipse IDE.
   - Click on `File` -> `Import`.
   - Select `Existing Projects into Workspace` and click `Next`.
   - Browse and select the cloned repository folder and select ``workspace`` folder, then click `Finish`.

### Running the Project

1. Open the `org.example.domainmodel` package in Eclipse.
2. Right-click on the `Domainmodel.xtext` file and select `Run As` -> `Generate Xtext Artifacts`. This will generate the Xtext artifacts for the DSL.
3. Right-click on the `Domainmodel.xtext` file again and select `Run As` -> `Generate Xtext ANTLR Artifacts`. This will generate the ANTLR artifacts for the DSL.
4. Now, you can run the unit tests located in the `org.example.domainmodel.tests` package to validate the functionality of the DSL.

### Project Structure

The project is structured as follows:

- `org.example.domainmodel`: The main Eclipse plugin project for the DSL.
- `org.example.domainmodel.tests`: The test project for unit testing the DSL.

## Additional Notes

The `runtime` folder in this repository is the result of running the DSL as an Eclipse Application using the Xtext runtime environment.

## Contact

If you have any questions or need further assistance, feel free to reach out to me via email at `zakifadlan3300@gmail.com`.

