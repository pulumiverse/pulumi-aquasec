// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.ServiceScopeVariableArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Indicates the application scope of the service.
     * 
     */
    @Import(name="applicationScopes", required=true)
    private Output<List<String>> applicationScopes;

    /**
     * @return Indicates the application scope of the service.
     * 
     */
    public Output<List<String>> applicationScopes() {
        return this.applicationScopes;
    }

    /**
     * A textual description of the service record; maximum 500 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A textual description of the service record; maximum 500 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enforcement status of the service.
     * 
     */
    @Import(name="enforce")
    private @Nullable Output<Boolean> enforce;

    /**
     * @return Enforcement status of the service.
     * 
     */
    public Optional<Output<Boolean>> enforce() {
        return Optional.ofNullable(this.enforce);
    }

    /**
     * Indicates if monitoring is enabled or not
     * 
     */
    @Import(name="monitoring")
    private @Nullable Output<Boolean> monitoring;

    /**
     * @return Indicates if monitoring is enabled or not
     * 
     */
    public Optional<Output<Boolean>> monitoring() {
        return Optional.ofNullable(this.monitoring);
    }

    /**
     * The name of the service. It is recommended not to use whitespace characters in the name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the service. It is recommended not to use whitespace characters in the name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The service&#39;s policies; an array of container firewall policy names.
     * 
     */
    @Import(name="policies", required=true)
    private Output<List<String>> policies;

    /**
     * @return The service&#39;s policies; an array of container firewall policy names.
     * 
     */
    public Output<List<String>> policies() {
        return this.policies;
    }

    /**
     * Rules priority, must be between 1-100.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Rules priority, must be between 1-100.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Logical expression of how to compute the dependency of the scope variables.
     * 
     */
    @Import(name="scopeExpression", required=true)
    private Output<String> scopeExpression;

    /**
     * @return Logical expression of how to compute the dependency of the scope variables.
     * 
     */
    public Output<String> scopeExpression() {
        return this.scopeExpression;
    }

    /**
     * List of scope attributes.
     * 
     */
    @Import(name="scopeVariables", required=true)
    private Output<List<ServiceScopeVariableArgs>> scopeVariables;

    /**
     * @return List of scope attributes.
     * 
     */
    public Output<List<ServiceScopeVariableArgs>> scopeVariables() {
        return this.scopeVariables;
    }

    /**
     * Type of the workload. container or host.
     * 
     */
    @Import(name="target", required=true)
    private Output<String> target;

    /**
     * @return Type of the workload. container or host.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    private ServiceArgs() {}

    private ServiceArgs(ServiceArgs $) {
        this.applicationScopes = $.applicationScopes;
        this.description = $.description;
        this.enforce = $.enforce;
        this.monitoring = $.monitoring;
        this.name = $.name;
        this.policies = $.policies;
        this.priority = $.priority;
        this.scopeExpression = $.scopeExpression;
        this.scopeVariables = $.scopeVariables;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceArgs $;

        public Builder() {
            $ = new ServiceArgs();
        }

        public Builder(ServiceArgs defaults) {
            $ = new ServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationScopes Indicates the application scope of the service.
         * 
         * @return builder
         * 
         */
        public Builder applicationScopes(Output<List<String>> applicationScopes) {
            $.applicationScopes = applicationScopes;
            return this;
        }

        /**
         * @param applicationScopes Indicates the application scope of the service.
         * 
         * @return builder
         * 
         */
        public Builder applicationScopes(List<String> applicationScopes) {
            return applicationScopes(Output.of(applicationScopes));
        }

        /**
         * @param applicationScopes Indicates the application scope of the service.
         * 
         * @return builder
         * 
         */
        public Builder applicationScopes(String... applicationScopes) {
            return applicationScopes(List.of(applicationScopes));
        }

        /**
         * @param description A textual description of the service record; maximum 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A textual description of the service record; maximum 500 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enforce Enforcement status of the service.
         * 
         * @return builder
         * 
         */
        public Builder enforce(@Nullable Output<Boolean> enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param enforce Enforcement status of the service.
         * 
         * @return builder
         * 
         */
        public Builder enforce(Boolean enforce) {
            return enforce(Output.of(enforce));
        }

        /**
         * @param monitoring Indicates if monitoring is enabled or not
         * 
         * @return builder
         * 
         */
        public Builder monitoring(@Nullable Output<Boolean> monitoring) {
            $.monitoring = monitoring;
            return this;
        }

        /**
         * @param monitoring Indicates if monitoring is enabled or not
         * 
         * @return builder
         * 
         */
        public Builder monitoring(Boolean monitoring) {
            return monitoring(Output.of(monitoring));
        }

        /**
         * @param name The name of the service. It is recommended not to use whitespace characters in the name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the service. It is recommended not to use whitespace characters in the name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policies The service&#39;s policies; an array of container firewall policy names.
         * 
         * @return builder
         * 
         */
        public Builder policies(Output<List<String>> policies) {
            $.policies = policies;
            return this;
        }

        /**
         * @param policies The service&#39;s policies; an array of container firewall policy names.
         * 
         * @return builder
         * 
         */
        public Builder policies(List<String> policies) {
            return policies(Output.of(policies));
        }

        /**
         * @param policies The service&#39;s policies; an array of container firewall policy names.
         * 
         * @return builder
         * 
         */
        public Builder policies(String... policies) {
            return policies(List.of(policies));
        }

        /**
         * @param priority Rules priority, must be between 1-100.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Rules priority, must be between 1-100.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param scopeExpression Logical expression of how to compute the dependency of the scope variables.
         * 
         * @return builder
         * 
         */
        public Builder scopeExpression(Output<String> scopeExpression) {
            $.scopeExpression = scopeExpression;
            return this;
        }

        /**
         * @param scopeExpression Logical expression of how to compute the dependency of the scope variables.
         * 
         * @return builder
         * 
         */
        public Builder scopeExpression(String scopeExpression) {
            return scopeExpression(Output.of(scopeExpression));
        }

        /**
         * @param scopeVariables List of scope attributes.
         * 
         * @return builder
         * 
         */
        public Builder scopeVariables(Output<List<ServiceScopeVariableArgs>> scopeVariables) {
            $.scopeVariables = scopeVariables;
            return this;
        }

        /**
         * @param scopeVariables List of scope attributes.
         * 
         * @return builder
         * 
         */
        public Builder scopeVariables(List<ServiceScopeVariableArgs> scopeVariables) {
            return scopeVariables(Output.of(scopeVariables));
        }

        /**
         * @param scopeVariables List of scope attributes.
         * 
         * @return builder
         * 
         */
        public Builder scopeVariables(ServiceScopeVariableArgs... scopeVariables) {
            return scopeVariables(List.of(scopeVariables));
        }

        /**
         * @param target Type of the workload. container or host.
         * 
         * @return builder
         * 
         */
        public Builder target(Output<String> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Type of the workload. container or host.
         * 
         * @return builder
         * 
         */
        public Builder target(String target) {
            return target(Output.of(target));
        }

        public ServiceArgs build() {
            $.applicationScopes = Objects.requireNonNull($.applicationScopes, "expected parameter 'applicationScopes' to be non-null");
            $.policies = Objects.requireNonNull($.policies, "expected parameter 'policies' to be non-null");
            $.scopeExpression = Objects.requireNonNull($.scopeExpression, "expected parameter 'scopeExpression' to be non-null");
            $.scopeVariables = Objects.requireNonNull($.scopeVariables, "expected parameter 'scopeVariables' to be non-null");
            $.target = Objects.requireNonNull($.target, "expected parameter 'target' to be non-null");
            return $;
        }
    }

}
