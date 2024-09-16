# Kubernetes Assignment

## Prerequisites
Before running this project, ensure you have the following installed:

- **Docker** (already installed by IT team)
- **Minikube**
- **Kubectl**
- **Github**

## Steps to Run the Application

### 1. Clone the Repository
git clone https://github.com/atulsharma18/kubernetes-assignment.git

### 2. Build Docker Image
docker build -t atulsharma18/kubernetes-assignment-app:latest .

### 3. Push Docker Image to Docker Hub
docker login
docker push atulsharma18/kubernetes-assignment-app:latest

### 4. Start Minikube
minikube start

### 5. Check Minikube status
minikube status

### 6. Deploy the Application
kubectl apply -f deployment.yaml

### 7. Expose the Service
kubectl apply -f service.yaml

### 8. Get Deployments
kubectl get deployments

### 9. Get Services
kubectl get svc

### 10. Get list all the pods
kubectl get pods

### 11. Access the Application
minikube service kubernetes-assignment-service --url

### 12. Scaling the Application
kubectl scale deployment kubernetes-assignment-deployment --replicas=5

### 13. Verifying the Health Checks
kubectl describe pod <pod-name>

### 14. Stop Minikube
minikube stop




   




