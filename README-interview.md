Pre-requisites: 

 

1.     An EKS Cluster with a dedicated namespace to deploy the workload on 

a.     Preferred tools to be installed on your workstation 

                                                                        i.EKSCTL - Installing eksctl - Amazon EKS 
		kubectl config get-contexts
		kubectl config use-context arn:aws:eks:us-east-1:855430746673:cluster/sre-lab

                                                                       ii.Kubectl - https://docs.aws.amazon.com/eks/latest/userguide/install-kubectl.html 

                                                                     iii.AWS CLI - Installing or updating the latest version of the AWS CLI - AWS Command Line Interface (amazon.com) 

2.     Terraform CLI - Install Terraform | Terraform - HashiCorp Learn 

3.     VSCODE Editor: https://code.visualstudio.com/Download - Preferred  

4.     GIT CLI: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git 

5.     A GITHUB account: https://github.com/ 

6.     A Docker hub account: https://hub.docker.com/ 

7.     Integrate your GITHUB account with SonarCloud: https://sonarcloud.io/  







============My secret id 

Access Key ID:
AKIASMGW5SKDRQYDKTPJ
Secret Access Key:
WoVXlCxPte8jqzJnbSH0C9gscal17Kw6s7f3zjrG

us-west-2

====================How i can connect to any cluster- tufail-sre - Kenneth - revature

Access: AKIA4OK5FKIYXHVX4D72
Secret: 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
us-east-1

Cluster name : tufail-sre

=======================

aws eks update-kubeconfig --name tufail-sre --region us-east-1

IPv4 Public IP
18.222.125.34

wget 

============================sre lab=====
Access Key ID: AKIA4OK5FKIY6RSF25GJ
Secret Access Key: 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
Region: us-east-1
aws configure --profile sre-lab
aws eks --region us-east-1 update-kubeconfig --name sre-lab --profile sre-lab
