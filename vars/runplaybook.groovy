def call() {

    sh " ansible-playbook -i inventory playbook.yml "
}
