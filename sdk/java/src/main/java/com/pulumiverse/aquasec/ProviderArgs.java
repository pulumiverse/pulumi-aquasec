// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderArgs extends com.pulumi.resources.ResourceArgs {

    public static final ProviderArgs Empty = new ProviderArgs();

    /**
     * This is the base URL of your Aqua instance. Can alternatively be sourced from the `AQUA_URL` environment variable.
     * 
     */
    @Import(name="aquaUrl")
    private @Nullable Output<String> aquaUrl;

    /**
     * @return This is the base URL of your Aqua instance. Can alternatively be sourced from the `AQUA_URL` environment variable.
     * 
     */
    public Optional<Output<String>> aquaUrl() {
        return Optional.ofNullable(this.aquaUrl);
    }

    /**
     * This is the file path for server CA certificates if they are not available on the host OS. Can alternatively be sourced
     * from the `AQUA_CA_CERT_PATH` environment variable.
     * 
     */
    @Import(name="caCertificatePath")
    private @Nullable Output<String> caCertificatePath;

    /**
     * @return This is the file path for server CA certificates if they are not available on the host OS. Can alternatively be sourced
     * from the `AQUA_CA_CERT_PATH` environment variable.
     * 
     */
    public Optional<Output<String>> caCertificatePath() {
        return Optional.ofNullable(this.caCertificatePath);
    }

    /**
     * This is the file path for Aqua provider configuration. The default configuration path is `~/.aqua/tf.config`. Can
     * alternatively be sourced from the `AQUA_CONFIG` environment variable.
     * 
     */
    @Import(name="configPath")
    private @Nullable Output<String> configPath;

    /**
     * @return This is the file path for Aqua provider configuration. The default configuration path is `~/.aqua/tf.config`. Can
     * alternatively be sourced from the `AQUA_CONFIG` environment variable.
     * 
     */
    public Optional<Output<String>> configPath() {
        return Optional.ofNullable(this.configPath);
    }

    /**
     * This is the password that should be used to make the connection. Can alternatively be sourced from the `AQUA_PASSWORD`
     * environment variable.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return This is the password that should be used to make the connection. Can alternatively be sourced from the `AQUA_PASSWORD`
     * environment variable.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * This is the user id that should be used to make the connection. Can alternatively be sourced from the `AQUA_USER`
     * environment variable.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return This is the user id that should be used to make the connection. Can alternatively be sourced from the `AQUA_USER`
     * environment variable.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * If true, server tls certificates will be verified by the client before making a connection. Defaults to true. Can
     * alternatively be sourced from the `AQUA_TLS_VERIFY` environment variable.
     * 
     */
    @Import(name="verifyTls", json=true)
    private @Nullable Output<Boolean> verifyTls;

    /**
     * @return If true, server tls certificates will be verified by the client before making a connection. Defaults to true. Can
     * alternatively be sourced from the `AQUA_TLS_VERIFY` environment variable.
     * 
     */
    public Optional<Output<Boolean>> verifyTls() {
        return Optional.ofNullable(this.verifyTls);
    }

    private ProviderArgs() {}

    private ProviderArgs(ProviderArgs $) {
        this.aquaUrl = $.aquaUrl;
        this.caCertificatePath = $.caCertificatePath;
        this.configPath = $.configPath;
        this.password = $.password;
        this.username = $.username;
        this.verifyTls = $.verifyTls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ProviderArgs $;

        public Builder() {
            $ = new ProviderArgs();
        }

        public Builder(ProviderArgs defaults) {
            $ = new ProviderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aquaUrl This is the base URL of your Aqua instance. Can alternatively be sourced from the `AQUA_URL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder aquaUrl(@Nullable Output<String> aquaUrl) {
            $.aquaUrl = aquaUrl;
            return this;
        }

        /**
         * @param aquaUrl This is the base URL of your Aqua instance. Can alternatively be sourced from the `AQUA_URL` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder aquaUrl(String aquaUrl) {
            return aquaUrl(Output.of(aquaUrl));
        }

        /**
         * @param caCertificatePath This is the file path for server CA certificates if they are not available on the host OS. Can alternatively be sourced
         * from the `AQUA_CA_CERT_PATH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder caCertificatePath(@Nullable Output<String> caCertificatePath) {
            $.caCertificatePath = caCertificatePath;
            return this;
        }

        /**
         * @param caCertificatePath This is the file path for server CA certificates if they are not available on the host OS. Can alternatively be sourced
         * from the `AQUA_CA_CERT_PATH` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder caCertificatePath(String caCertificatePath) {
            return caCertificatePath(Output.of(caCertificatePath));
        }

        /**
         * @param configPath This is the file path for Aqua provider configuration. The default configuration path is `~/.aqua/tf.config`. Can
         * alternatively be sourced from the `AQUA_CONFIG` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder configPath(@Nullable Output<String> configPath) {
            $.configPath = configPath;
            return this;
        }

        /**
         * @param configPath This is the file path for Aqua provider configuration. The default configuration path is `~/.aqua/tf.config`. Can
         * alternatively be sourced from the `AQUA_CONFIG` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder configPath(String configPath) {
            return configPath(Output.of(configPath));
        }

        /**
         * @param password This is the password that should be used to make the connection. Can alternatively be sourced from the `AQUA_PASSWORD`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password This is the password that should be used to make the connection. Can alternatively be sourced from the `AQUA_PASSWORD`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        /**
         * @param username This is the user id that should be used to make the connection. Can alternatively be sourced from the `AQUA_USER`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username This is the user id that should be used to make the connection. Can alternatively be sourced from the `AQUA_USER`
         * environment variable.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param verifyTls If true, server tls certificates will be verified by the client before making a connection. Defaults to true. Can
         * alternatively be sourced from the `AQUA_TLS_VERIFY` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder verifyTls(@Nullable Output<Boolean> verifyTls) {
            $.verifyTls = verifyTls;
            return this;
        }

        /**
         * @param verifyTls If true, server tls certificates will be verified by the client before making a connection. Defaults to true. Can
         * alternatively be sourced from the `AQUA_TLS_VERIFY` environment variable.
         * 
         * @return builder
         * 
         */
        public Builder verifyTls(Boolean verifyTls) {
            return verifyTls(Output.of(verifyTls));
        }

        public ProviderArgs build() {
            return $;
        }
    }

}
