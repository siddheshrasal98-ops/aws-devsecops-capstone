resource "aws_security_group" "employee_sg" {
  name        = "employee-management-sg"
  description = "Allow SSH and HTTP"

  ingress {
    description = "SSH"
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  ingress {
    description = "HTTP"
    from_port   = 8080
    to_port     = 8080
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  egress {
    from_port   = 0
    to_port     = 0
    protocol    = "-1"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Name = "employee-management-sg"
  }
}

resource "aws_instance" "employee_server" {
  ami                    = var.ami_id
  instance_type          = var.instance_type
  key_name = "employee-key"
  vpc_security_group_ids = [aws_security_group.employee_sg.id]
  
  tags = {
    Name = var.instance_name
  }
}