variable "aws_region" {
  description = "AWS Region"
  type        = string
  default     = "ap-south-1"
}

variable "instance_type" {
  description = "EC2 Instance Type"
  type        = string
  default     = "t2.micro"
}

variable "instance_name" {
  description = "EC2 Name"
  type        = string
  default     = "employee-management-server"
}

variable "ami_id" {
  description = "Amazon Linux 2023 AMI"
  type        = string
}