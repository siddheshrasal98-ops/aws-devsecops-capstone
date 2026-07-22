# AWS DevSecOps Capstone Project

## Project Overview

This project demonstrates a complete DevSecOps CI/CD pipeline for a Spring Boot Employee Management application using modern DevSecOps tools and AWS services.

The pipeline automates code build, security scanning, testing, containerization, deployment, monitoring, and infrastructure provisioning.

---

# Architecture

Developer
↓
GitHub
↓
Jenkins Pipeline
↓
Build (Maven)
↓
Unit Testing
↓
SonarQube Code Analysis
↓
OWASP Dependency Check
↓
Docker Image Build
↓
Docker Container Deployment
↓
Prometheus Monitoring
↓
Grafana Dashboard

Infrastructure is provisioned using Terraform on AWS.

---

# Technologies Used

- Java 17
- Spring Boot
- Maven
- MySQL
- Docker
- Docker Compose
- Jenkins
- Git & GitHub
- SonarQube
- OWASP Dependency Check
- Prometheus
- Grafana
- Terraform
- AWS EC2
- AWS VPC
- AWS Security Groups

---

# Features

- Employee CRUD Operations
- REST APIs
- MySQL Database Integration
- Dockerized Application
- Automated CI/CD Pipeline
- Static Code Analysis
- Dependency Vulnerability Scanning
- Infrastructure as Code
- Monitoring & Metrics
- Dashboard Visualization

---

# CI/CD Pipeline

1. Source Code Checkout
2. Maven Build
3. Unit Testing
4. SonarQube Analysis
5. OWASP Dependency Check
6. Docker Image Build
7. Docker Container Deployment
8. Prometheus Metrics Collection
9. Grafana Dashboard Monitoring

---

# Monitoring

Prometheus collects metrics from the Spring Boot Actuator endpoint.

Grafana visualizes:

- JVM Memory
- CPU Usage
- HTTP Requests
- Application Health
- Response Time

---

# Infrastructure

Terraform provisions:

- AWS VPC
- Public Subnet
- Internet Gateway
- Route Table
- Security Groups
- EC2 Instance

---

# Security

Implemented

- SonarQube Static Code Analysis
- OWASP Dependency Check
- Secure Docker Deployment

Planned Enhancements

- Open Policy Agent (OPA)
- Trivy Container Image Scanning
- Kubernetes Deployment
- ArgoCD GitOps

---

# Repository Structure

```
employee-management-api/
│
├── src/
├── terraform/
├── Dockerfile
├── docker-compose.yml
├── Jenkinsfile
├── pom.xml
├── README.md
└── prometheus.yml
```

---

# Future Improvements

- Kubernetes Deployment
- Helm Charts
- Trivy Integration
- OPA Policy Enforcement
- GitOps using ArgoCD

---

# Author

Siddhesh Rasal