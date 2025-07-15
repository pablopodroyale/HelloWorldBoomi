# HelloWorldBoomi
# Boomi Custom Connector – HelloWorldConnector

This is a simple custom connector for **Boomi AtomSphere** designed for demonstration or testing purposes. It generates a document containing the text `Hello {parameter}`, where the parameter is defined at the operation level in Boomi.

## 🔧 Features

- Custom connector that outputs a document with the text:
- The `{parameter}` value is set dynamically via the operation configuration in the Boomi process.
- Useful for testing custom connector deployment and data flow within Boomi processes.

## 📁 Project Structure

HelloWorldConnector/
├── src/
│ └── com/example/helloworld/
│ ├── HelloWorldConnector.java
│ ├── HelloWorldConnection.java
│ └── HelloWorldOperation.java
├── resources/
│ └── connector-metadata.json
├── pom.xml
└── README.md

## 🚀 How to Build

To build the connector using Maven:

```bash
mvn clean package

How to Use in Boomi
Navigate to Manage > Extensions > Custom Libraries in your Boomi AtomSphere account.

Upload the generated .jar file.

Create a new Connector component:

Choose Custom Connector

Select the uploaded JAR

In your Boomi process:

Add a connector shape using the custom connector

In the operation configuration, provide a value for the parameter field

When executed, the connector will return a document containing: Hello {YourProvidedValue}

Requirements
Java 8 or higher

Maven (for building)

Boomi Atom with support for Custom Libraries

Basic Boomi process knowledge

License
This project is provided under the MIT License.

Developed by
Pablo Podgaiz from Buenos Aires, Argentina
📧 pablo.podgaiz@com-it.io
🌐 www.com-it.io

We are open to collaboration and welcome project and development proposals.
