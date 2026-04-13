public class StudentInfo {
    public static void main(String args[]) {
        System.out.println("Student Name: Prathyangra R");
        System.out.println("Register Number: 23MIC0099");
        System.out.println("Message: Jenkins-GitHub Integration Successful");
    }
}
kubectl get nodes
kubectl create deployment webapp --image=nginx
kubectl get pods
kubectl scale deployment webapp --replicas=3
kubectl get pods
kubectl expose deployment webapp --type=NodePort --port=80
kubectl get svc
nano limited.yaml

Paste:

apiVersion: v1

kind: Pod

metadata:

 name: limited-pod

spec:

 containers:

 - name: nginx

 image: nginx

 resources:

 limits:

 cpu: "500m"

 memory: "128Mi"
kubectl apply -f limited.yaml
kubectl get pods
kubectl describe pod limited-pod
kubectl get all
