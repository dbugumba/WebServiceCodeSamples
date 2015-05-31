# Overview
This project explores the implementation of a web service called CurrencyConverter. The project outlines the logic and sequence of the steps taken to implement it; applications that might use the service; and the overall finding of the service’s conformance to the WS-I profile.

# Creating the project via Eclipse
The objective in this step was to initiate the service implementation. This was accomplished through two sub-steps.

1. Launching Eclipse and applying the ‘Web’ node to initiate the Dynamic Web Project wizard used to generate the project.
2. Inserting code to implement the service functionality. The code accepts multiple parameters, i.e. source, target, value, and returns a value. Eclipse was applied to produce both the client and the WSDL used to convert the code into a web service, and in testing the service locally.

# Deploying the service
The service was archived and deployed to a remote server ready for testing. It was deployed as an Axis possessing an ‘aar’ file extension in order to facilitate a smooth transfer into an Axis2 remote server directory.
   
# Testing the service
The service’s WSDL was used to generate a client, applying it to test the service on the remote server via Eclipse. SOAP request and response messages were viewed in the TCP/IP Monitor being transmitted across the Internet to the remote server. This affirmed the authenticity of the test.
   
# Publishing the service
Service descriptions were generated via UDDI directory on the remote server. UDDI is a basic standard for directories used to publish and discover services. The jUDDI Console was used to publish entries, instead of Eclipse, as jUDDI’s view is akin to the UDDI data structures.
     
# Testing the service’s conformance to WS-I Profile
Using WSDL, the service was tested for conformance to WS-I; it passed the test and its report was saved in a specified location, ready for submission as part of this work. The test aims to verify if the service conforms to the WS-I parameters, thereby maintaining interoperability.
   
The rationale behind the complete sequence of these steps appears to be based on the bottom-up approach, where the Web service’s XML descriptions are generated after the Java code is written.

# Potential Applications
The web service might be used by billing applications in both B2C and B2B e-business relationships among enterprises, small businesses and customers transacting business globally. It might also be used for payment applications in a C2B relationship, enabling customers to pay for products sold by companies overseas.

# Service Code (Business Logic)

The web service implemented performs a range of simple conversions between different currencies. The application converts a value from one currency to another; for example, it can be used to convert ten pounds sterling into an equivalent sum in American dollars or any one of a range of other currencies.

The Java code for the web service business logic is attached as a second file of the repository.

# How the Web app works
The CurrencyConverter class contains three elements.

The first element is a single integer with value '7', which states how many currencies are being supported. In Java, an array, which we are using to store conversion values, starts with a cell number of zero; therefore '7' means that we are using eight currencies (0–7).
 
The second element is a two-dimensional Java array. This can be used to convert a value from one currency to another. Each currency has a corresponding column and row number. To convert from pounds to Yen, for example, we can pick the column for pounds (column 0) and the row for Yen (row 3). The cell where the column and row intersect contains the value '205.542', which tells us that 1 pound is worth 205.542 Yen.

The third element in the class is a method called convert, which takes three arguments. The first argument is the column number of the source currency, the second is the row number of the target currency and the third is the value to be converted from source currency to target currency. So, for example, convert can be called as follows:
 
convert(0, 6, 10)
 
This will convert 10 British pounds (column 0) into 767.316 Indian Rupees (row 6).
