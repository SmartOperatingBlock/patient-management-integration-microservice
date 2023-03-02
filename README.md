# Patient Management System Microservice

![Release](https://github.com/smartoperatingblock/patient-management-integration-microservice/actions/workflows/build-and-deploy.yml/badge.svg?style=plastic)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=plastic)](https://opensource.org/licenses/MIT)
![Version](https://img.shields.io/github/v/release/smartoperatingblock/patient-management-integration-microservice?style=plastic)

[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_patient-management-integration-microservice&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_patient-management-integration-microservice)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_patient-management-integration-microservice&metric=bugs)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_patient-management-integration-microservice)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_patient-management-integration-microservice&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_patient-management-integration-microservice)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=SmartOperatingBlock_patient-management-integration-microservice&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=SmartOperatingBlock_patient-management-integration-microservice)

The integration microservice responsible to store and provide patients informations.

## Usage
1. Provide a `.env` file with the following variables:
    - PATIENT_MANAGEMENT_MONGODB_URL
2. Run the container with the command:

   `docker run ghcr.io/smartoperatingblock/patient-management-integration-microservice:latest`

## Documentation
- Check out the latest REST API [here](https://smartoperatingblock.github.io/patient-management-integration-microservice/documentation/openapi-doc/).
- Check out the code documentation [here](https://smartoperatingblock.github.io/patient-management-integration-microservice/documentation/code-doc/).
