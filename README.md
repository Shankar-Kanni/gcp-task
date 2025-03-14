#Steps to change the public IP for micro8ks which is running on Google Compute Engine

```t
shankarkanni80@gcptutorials-vm:/var/snap/microk8s/current/certs$ cat csr.conf.template | grep IP.99
IP.99 = 34.45.120.47
shankarkanni80@gcptutorials-vm:/var/snap/microk8s/current/certs$ vi csr.conf.template 
shankarkanni80@gcptutorials-vm:/var/snap/microk8s/current/certs$ cd /var/snap/microk8s/current/certs/
shankarkanni80@gcptutorials-vm:/var/snap/microk8s/current/certs$ cat csr.conf.template | grep IP.99
IP.99 = 34.69.120.105
shankarkanni80@gcptutorials-vm:/var/snap/microk8s/current/certs$ 
```
