FROM alpine:3.5

RUN apk --update add nodejs git openssh ca-certificates && \
    rm -rf /var/cache/apk/* && \
    npm install git2consul@0.12.13 --global && \
    mkdir -p /etc/git2consul.d && \
    mkdir /config

#ENTRYPOINT [ "/usr/bin/node", "/usr/lib/node_modules/git2consul" ]

ADD /git2consul.sh /
ADD /git2consul.json /config

ENV INIT_SLEEP_SECONDS=5
ENV CONSUL_URL=localhost
ENV CONSUL_PORT=8500

CMD /git2consul.sh