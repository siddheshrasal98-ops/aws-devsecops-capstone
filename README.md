# 🚀 AWS DevSecOps Capstone Project

## 📌 Project Overview

This project demonstrates an end-to-end DevSecOps CI/CD pipeline for a Spring Boot Employee Management application using Jenkins, Docker, AWS, SonarQube, Trivy, OWASP Dependency Check, OWASP ZAP, Prometheus, and Grafana.

The pipeline automates code quality analysis, security scanning, containerization, deployment, monitoring, and secret management following DevSecOps best practices.

---

# 🏗️ Architecture Diagram

![Architecture Diagram](employee-management-api/screenshots/architecture/architecture-diagram.png)

---

# 🛠️ Tech Stack

| Category | Technologies |
|-----------|--------------|
| Language | Java 17 |
| Framework | Spring Boot |
| Build Tool | Maven |
| Version Control | Git & GitHub |
| CI/CD | Jenkins |
| Code Quality | SonarQube |
| Dependency Security | OWASP Dependency Check |
| Container Security | Trivy |
| Dynamic Security Testing | OWASP ZAP |
| Containerization | Docker |
| Secrets Management | AWS Secrets Manager |
| Monitoring | Prometheus |
| Visualization | Grafana |

---

# 📂 Project Structure

```
aws-devsecops-capstone/
│
├── README.md
├── LICENSE
├── .gitignore
│
└── employee-management-api/
    ├── Jenkinsfile
    ├── Dockerfile
    ├── pom.xml
    ├── prometheus.yml
    ├── policy/
    ├── src/
    └── screenshots/
```

---

# ⚙️ CI/CD Pipeline Stages

✅ Source Code Checkout

✅ Maven Build

✅ Unit Testing

✅ SonarQube Code Analysis

✅ OWASP Dependency Check

✅ Trivy Image Scan

✅ Docker Image Build

✅ AWS Secrets Retrieval

✅ Docker Container Deployment

✅ OWASP ZAP DAST Scan

✅ Monitoring using Prometheus & Grafana

---

# 📸 Screenshots

## Jenkins

### Pipeline Success

![Pipeline](employee-management-api/screenshots/jenkins/01-pipeline-success.png)

### Console Output

![Console](employee-management-api/screenshots/jenkins/02-console-output-success.png)

---

## SonarQube

![SonarQube](employee-management-api/screenshots/sonarqube/sonarqube-dashboard.png)

---

## OWASP Dependency Check

![Dependency Check](employee-management-api/screenshots/dependency-check/dependency-check.png)

---

## Trivy Image Scan

![Trivy](employee-management-api/screenshots/trivy/trivy-scan.png)

---

## Docker

![Docker](employee-management-api/screenshots/docker/docker-containers.png)

---

## AWS Secrets Manager

![AWS Secrets](employee-management-api/screenshots/aws-secrets/aws-secret.png)

---

## Prometheus

![Prometheus](employee-management-api/screenshots/prometheus/prometheus-targets.png)

---

## Grafana

![Grafana](employee-management-api/screenshots/grafana/grafana-dashboard.png)

---

## OWASP ZAP

![OWASP ZAP](employee-management-api/screenshots/zap/zap-report.png)

---

# 🔒 Security Features

- SonarQube Static Code Analysis
- OWASP Dependency Check
- Trivy Container Image Scanning
- OWASP ZAP Dynamic Application Security Testing
- AWS Secrets Manager Integration
- Secure Jenkins Credentials Management

---

# 📈 Monitoring

The deployed application is monitored using:

- Prometheus Metrics
- Spring Boot Actuator
- Grafana Dashboard

---

# 🚀 How to Run

## Clone Repository

```bash
git clone https://github.com/siddheshrasal98-ops/aws-devsecops-capstone.git
```

## Navigate

```bash
cd aws-devsecops-capstone/employee-management-api
```

## Build

```bash
mvn clean package
```

## Build Docker Image

```bash
docker build -t employee-api .
```

## Run Container

```bash
docker run -d -p 8080:8080 employee-api
```

---

# 📊 Project Highlights

- End-to-End DevSecOps Pipeline
- Automated CI/CD
- Static & Dynamic Security Testing
- Docker Containerization
- AWS Secrets Manager Integration
- Monitoring with Prometheus & Grafana
- Security-first Deployment Pipeline

---

# 👨‍💻 Author

**Siddhesh Rasal**

GitHub:
https://github.com/siddheshrasal98-ops

LinkedIn:
(Add your LinkedIn profile link)

---

# ⭐ If you found this project useful, consider giving it a Star!
