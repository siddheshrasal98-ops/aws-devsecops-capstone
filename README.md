# 🚀 AWS DevSecOps CI/CD Pipeline for Employee Management Application

## 📌 Project Overview

This project demonstrates the implementation of a complete **AWS DevSecOps CI/CD Pipeline** for a Spring Boot Employee Management Application. The solution integrates Continuous Integration, Infrastructure as Code (IaC), DevSecOps security practices, automated deployment, and monitoring using industry-standard tools and AWS cloud services.

The pipeline automates code integration, quality analysis, security validation, infrastructure provisioning, containerization, deployment, and observability while following modern DevSecOps best practices.

---

# 🎯 Objectives

- Automate application build and deployment using Jenkins.
- Implement Infrastructure as Code using Terraform.
- Integrate security throughout the CI/CD pipeline.
- Perform automated vulnerability scanning.
- Secure sensitive credentials using AWS Secrets Manager.
- Deploy containerized applications using Docker.
- Monitor infrastructure and application performance using Prometheus and Grafana.

---

# 🛠 Technology Stack

| Category | Tools |
|-----------|--------|
| Version Control | Git, GitHub |
| CI/CD | Jenkins |
| Build Tool | Maven |
| Application | Spring Boot |
| Static Code Analysis (SAST) | SonarQube |
| Software Composition Analysis (SCA) | OWASP Dependency Check |
| Infrastructure as Code | Terraform |
| IaC Security | Checkov |
| Policy as Code | Open Policy Agent (OPA) |
| Containerization | Docker |
| Container Security | Trivy |
| Secret Management | AWS Secrets Manager |
| Dynamic Application Security Testing | OWASP ZAP |
| Monitoring | Spring Boot Actuator, Prometheus, Grafana |
| Cloud Platform | AWS |

---

# 🔄 CI/CD Pipeline Workflow

```
Developer
     │
     ▼
GitHub Repository
     │
     ▼
Jenkins Pipeline
     │
     ├── Source Code Checkout
     ├── Maven Build
     ├── SonarQube (SAST)
     ├── OWASP Dependency Check (SCA)
     ├── Checkov (IaC Scan)
     ├── Open Policy Agent (OPA)
     ├── Terraform (AWS Infrastructure)
     ├── Docker Build
     ├── Trivy Image Scan
     ├── AWS Secrets Manager
     ├── Docker Deployment
     ├── OWASP ZAP (DAST)
     ▼
Spring Boot Application
     │
     ├── Spring Boot Actuator
     ▼
Prometheus
     ▼
Grafana
```

---

# 🔐 DevSecOps Security Implementation

- ✅ SonarQube – Static Application Security Testing (SAST)
- ✅ OWASP Dependency Check – Software Composition Analysis (SCA)
- ✅ Checkov – Infrastructure as Code Security Scanning
- ✅ Open Policy Agent (OPA) – Policy as Code Validation
- ✅ Trivy – Docker Image Vulnerability Scanning
- ✅ AWS Secrets Manager – Secure Secret Management
- ✅ OWASP ZAP – Dynamic Application Security Testing (DAST)

---

# ☁ Infrastructure as Code

Infrastructure provisioning is automated using **Terraform**, including:

- AWS Provider Configuration
- EC2 Instance Provisioning
- Security Groups
- IAM Configuration
- Terraform State Management
- Jenkins Integration

Terraform Commands Used:

```bash
terraform init
terraform plan
terraform apply
terraform destroy
```

---

# 📊 Monitoring & Observability

The deployed application is continuously monitored using:

- Spring Boot Actuator
- Prometheus
- Grafana Dashboards

Metrics monitored include:

- CPU Usage
- Memory Usage
- JVM Metrics
- Application Health
- Network Statistics

---

# 📂 Repository Structure

```
aws-devsecops-capstone/
│
├── employee-management-api/
├── terraform/
├── opa/
├── screenshots/
├── Jenkinsfile
├── Dockerfile
├── docker-compose.yml
├── README.md
└── LICENSE
```

---

# 📸 Project Screenshots

The repository includes screenshots for:

- Jenkins Pipeline Success
- SonarQube Dashboard
- OWASP Dependency Check Report
- Checkov Scan
- Terraform Deployment
- Docker Containers
- Trivy Scan
- AWS Secrets Manager
- Prometheus Targets
- Grafana Dashboard
- OWASP ZAP Report
- Architecture Diagram

---

# ⭐ Key Features

- Automated CI/CD Pipeline
- Infrastructure as Code (Terraform)
- Shift-Left DevSecOps Implementation
- Secure Secret Management
- Automated Security Scanning
- Containerized Deployment
- Real-Time Monitoring
- Policy as Code Validation
- AWS Cloud Deployment

---

# 🚀 Future Enhancements

- Kubernetes Deployment
- Amazon EKS
- Helm Charts
- Argo CD (GitOps)
- Slack/MS Teams Notifications
- Blue-Green Deployment
- Canary Deployment
- Automated Rollback Strategy

---

# 👨‍💻 Author

**Siddhesh Rasal**

GitHub: https://github.com/siddheshrasal98-ops

---

# 📜 License

This project was developed as part of the **Edureka Post Graduate Program in DevOps (PGDM)** for educational and portfolio purposes.
